import java.util.function.BiFunction;

class Arithmetic{
	//referring methods
	public static int add(int number_one, int  number_two) {
		return number_one+number_two;
	}
	public static float sum(float number_one, float  number_two) {
		return number_one+number_two;
	}
	public static float addition(float number_one, float  number_two) {
		return number_one+number_two;
	}	
}
public class mulitmethodreference {

	public static void main(String[] args) {
		//Instance created for all the three methods
		
		BiFunction<Integer,Integer,Integer>  adder = Arithmetic::add; //static method referenced
		BiFunction <Float,Float,Float>  adder2 = Arithmetic::sum;//static method referenced
		BiFunction<Float,Float,Float>  adder3 = Arithmetic::addition;//static method referenced
		
		//print the result		
		int result = adder.apply(10,20);
		float result2 = adder2.apply(10f,20f);
		float result3 = adder3.apply(10f,20f);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
	}
}
