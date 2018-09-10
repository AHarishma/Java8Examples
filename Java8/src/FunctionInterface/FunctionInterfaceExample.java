package FunctionInterface;
import java.util.function.Function;

public class FunctionInterfaceExample {
public static void main(String[] args)
{   
	//anonymous-class
	Function<Integer, Integer> addFive = new Function<Integer,Integer>() {
		@Override
		public Integer apply(Integer x)
		{
			return x+5;
		}
	};
	System.out.println(addFive.apply(4));
	
	
	//lambda
	Function<Integer, Integer> addFive1=(x)->x+5;
	System.out.println(addFive1.apply(4));
}
}
