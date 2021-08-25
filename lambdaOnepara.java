//Lambda Expressions with one/single parameters

interface Sayable{
	public String say(String name);
}


// I want an Output to be saying Hello sachin!!!!!

public class lambdaOnepara {

	public static void main(String[] args) {
		Sayable result = (name)-> {
			//return "Hello,"+name + "I have Many things to say";
		};
		System.out.println(result.say("Sachin "));
	}

}
