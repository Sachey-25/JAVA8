interface demon{
	void say();
}
class InstanceMethodReference{
	public void saySomething() {
		System.out.println("Hell0, I am Non-Static method");
	}
}
class InstanceMethodReference_two{
	public void printMsg() {
		System.out.println("Hello, I am Instance Method");
	}
}
public class RefenceInstnceMethod {
	public static void main(String[] args) {		
		//Creating an Object to the read the class
		InstanceMethodReference methodReference = new InstanceMethodReference();
		//Referring non-static method using reference
		demon sayable = methodReference::saySomething;
		//Calling interface method
		sayable.say();		
		//Referring non-static method using anonymous object
		demon object = new InstanceMethodReference()::saySomething;
		//Calling interface method
		object.say();		
		//Creating an Object to refer the instance method.
		Thread th = new Thread(new InstanceMethodReference_two()::printMsg);
		th.start();		
		}
}