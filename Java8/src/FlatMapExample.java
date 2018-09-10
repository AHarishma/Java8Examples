import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {

	public static void main(String[] args) {
		List<Integer> even = new ArrayList<>(Arrays.asList(2, 4, 6));
		List<Integer> odd = new ArrayList<>(Arrays.asList(1, 3, 5));
		List<List<Integer>> numbers = new ArrayList<>();
		numbers.add(even);
		numbers.add(odd);
		System.out.println(numbers);
		
		//for each
		for(int i : even)
		{
			System.out.println(i);
		}

		// Anonymous Class
		List<Integer> result = numbers.stream().flatMap(new Function<List<Integer>, Stream<Integer>>() {
			@Override
			public Stream<Integer> apply(List<Integer> ints) {
				return ints.stream();
			}
		}).collect(Collectors.toList());
		System.out.println(result);
		Collections.sort(result);
		System.out.println(result);

		// Method reference
		List<Integer> result1 = numbers.stream().flatMap(Collection::stream).collect(Collectors.toList());
		System.out.println(result1);
		Collections.sort(result1);
		System.out.println(result1);

		// Lambda
		List<Integer> result2 = numbers.stream().flatMap(number -> number.stream()).collect(Collectors.toList());
		System.out.println(result2);
		Collections.sort(result2);
		System.out.println(result2);
	}

}
