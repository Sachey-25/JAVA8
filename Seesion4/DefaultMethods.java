package Seesion4;

interface Session{
	//Default method
	default void greet() {
		System.out.println("Hello, My name is Defaut");
	}
	//Abstract Method
	void pleasetalk(String msg);
	
	//Static method
	static void SayLouder(String msg) {
		System.out.println(msg);
	}
}
public class DefaultMethods implements Session{
	public void pleasetalk(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		//Implementation of default and interfaces with abstract method
		DefaultMethods dm = new DefaultMethods();
		dm.greet();
		dm.pleasetalk("And I got executed");
		Session.SayLouder("Hellooooooo... Iam Static mehod");
	}
//Tagged with default keyword
}
