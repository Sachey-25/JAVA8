//to create the interface class we need to be out the class
// keyword interface

@FunctionalInterface
interface Drawable{
	public void draw();
}
public class LambadExpressions {

	public static void main(String[] args) {
		
		int width = 10; //One value
		
		//Without the lambda expression, the code is going to be
		/*Drawable d = new Drawable() {
			public void draw() {
				System.out.println("Drawing" + width);
				}	 
		};
		d.draw();*/
		
		//WIth the lambda expression 
		Drawable d1 = ()->{
			System.out.println("Drawing " + width);
		}; 
		d1.draw();
		
		//Second function implementation
		SayHello s=() -> {
			return "I have nothing to say";
		};
		System.out.println(s.say());
	}
}
// Lambda Expressions : No-paramerter

interface SayHello{
	public String say();
}













