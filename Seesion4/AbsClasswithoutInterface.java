package Seesion4;

abstract class AbstractClass{
	public AbstractClass() {
		System.out.println("You can create construtor in abstract class");
	}
	// Abstract method
	abstract int sum(int number_one, int number_two); 
	//non-static method
	int sub(int number_one, int number_two) { 
		return number_one-number_two;
	}
	//Static method
	static int mul(int number_one, int number_two) {
		return number_one*number_two;
	}
}

public class AbsClasswithoutInterface extends AbstractClass{
	//implementing Abstract method
	public int sum(int number_one, int number_two) {
		return number_one+number_two ;
	}

	public static void main(String[] args) {
		//an object for the abstract method
		AbsClasswithoutInterface abs = new AbsClasswithoutInterface();
		//Calling  Abstract method
		int addition = abs.sum(201,10);
		//Calling non-abstract method
		int subtraction = abs.sub(20,10);
		//Calling Static method
		int muliplication = AbstractClass.mul(20,10);
		
		System.out.println("Addition of two numbers : " + addition);
		System.out.println("subtraction of two numbers : " + subtraction);
		System.out.println("Multiplication of two numbers : " + muliplication);
	}

}
