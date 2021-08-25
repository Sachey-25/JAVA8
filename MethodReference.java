import java.util.function.BiFunction;

//Interface class
class Arithmetic{
	public static int add(int number_one, int number_two) {
		return number_one+number_two;
	}
}

//Interface class
interface listen{
		//Interface method
		void fun();
}
public class MethodReference {
	//Static Method
	public static void something() {
		System.out.println("Hello, This is Static Method");
	}
	public static void main(String[] args) {
		//Referring to the static method
		listen func = MethodReference::something;
		//Calling interface method
		func.fun();
		
		//Example - 2 Using BiFunction java 8 utility
		BiFunction<Integer,Integer,Integer> sum = Arithmetic::add;
		int  result = sum.apply(100,200);
		System.out.println("Additon of two numbers 100 and 200 is :" + result);
	}
}