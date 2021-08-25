import java.util.List;
import java.util.*;

@FunctionalInterface
interface Talk{
	String talk(String Message);
}



interface addition{
	int sum(int number_one, int number_two);
}
public class lambdamulti {

	public static void main(String[] args) {		
		//Lets talk to lambda Expression
		addition add=(number_one,number_two) -> (number_one+number_two);
		System.out.println(add.sum(100, 200));
		// Lambda with subtraction
		addition sub=(number_one,number_two) -> (number_one-number_two);
		System.out.println(sub.sum(100, 200));
		//Lambda With multiplication
		addition mul=(number_one,number_two) -> (number_one*number_two);
		System.out.println(mul.sum(100, 200));
		//Lambda with division
		addition div=(number_one,number_two) -> (number_one/number_two);
		System.out.println(div.sum(100, 200));
		
		//Java Lambda Expressions With Foreach loop
		
		//Collection -- List 
		List<String> list = new ArrayList<String>();
		list.add("Sachin");
		list.add("Sourav");
		list.add("Rahul");
		list.add("Virendra");
		
		list.forEach(
				(a)->System.out.println(a)
				);		
	System.out.println("------------------------------------------------------------");
	//I wanted to print the multiple statement using lambda expressions
		Talk person =(Message) ->{
			String info = "We are glad to connect today ";
			String inform = info + Message;
			return inform;
		};
		System.out.println(person.talk("I am sorry for Yesterday!!!"));
	
	}
}