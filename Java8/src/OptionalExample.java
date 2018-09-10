import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4,5,6,7));

		// peek() is used for debugging
		Optional<Integer> result = list.stream().peek(System.out::println).filter(num -> num > 5)
				.peek(num -> System.out.println("Filtered numbers are " + num)).findAny();
		result.ifPresent(System.out::println);
	}

}
