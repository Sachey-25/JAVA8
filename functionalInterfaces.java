
// A functional interface can have method of object class.
// Note : A functional interface can extends another interface only,
// when it does not have any abstract method

/*interface sayable{
	void say(String msg); //Abstract method
	//It can contain any number of Object class methods.
	int hashCode();
	String toString();
	boolean equals(Object obj);
}
class FunctionalInterface implements sayable{
	public void say(String msg){
		System.out.println(msg);
	}
}*/

// Note : A functional interface can extends another interface only,
// when it does not have any abstract method

/*interface sayable{
	void say(String msg); // Abstract method
}
@FunctionalInterface
interface Doable extends sayable{
	//Invalid '@functionaInterface' annotation ; Doable is not a 
	//functional interface
	void doit();
}*/

interface Doable{
	default void doit() {
		System.out.println("Do it now!!!!!");
	}
}
interface sayable extends Doable{
	void say(String msg); // Abstract method
}
class FunctionalInterface implements sayable{
	public void say(String msg) {
		System.out.println(msg);
	}
}
public class functionalInterfaces {
	public static void main(String[] args) {		
		FunctionalInterface Object = new FunctionalInterface();
		Object.say("Hello to the world from JAVA functional Interface");
		Object.doit();
		}
}