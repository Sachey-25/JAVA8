package day5;
import java.util.ArrayList;
import java.util.List;
public class Foreachmethod {
	public static void main(String[] args) {
		//default void forEach(elements to be taken an action)
		List<String > EmployeeList = new ArrayList<String>();
		EmployeeList.add("Sachin A");
		EmployeeList.add("SOurav");
		EmployeeList.add("Rahul");
		EmployeeList.add("Zaheer");
		EmployeeList.add("Yuvraj");
		EmployeeList.add("Ajay");		
		System.out.println("We are using the forEach Method");
		
		System.out.println("______________________________________");
		//default void forEach(elements to be taken an action)
		List<String > Student = new ArrayList<String>();
		Student.add("Sachin A");
		Student.add("SOurav");
		Student.add("Rahul");
		Student.add("Zaheer");
		Student.add("Yuvraj");
		Student.add("Ajay");		
		System.out.println("We are using the forEach Method");
		
		//Lambda expression
		EmployeeList.forEach(
				name -> System.out.println(name));
		System.out.println("______________________________________");
		//Lambda expression
				EmployeeList.forEach(System.out::println);
		//Java Stream forEachOrdered() Method //Ternary Operator "?"
		List<String> TreeList = new ArrayList<String>();
		//Syntax: void ForEachOrdered(Consumer<? super T> action)
		TreeList.add("BaniyanTree");
		TreeList.add("Pine Tree");
		TreeList.add("Ashoka Tree");
		TreeList.add("Coconut Tree");
		TreeList.add("Neem Tree");
		System.out.println("Stream ForEachOrdered Method");
		TreeList.stream().forEachOrdered(tree -> System.out.println(tree));
		System.out.println("----------------------------------------------");
		TreeList.stream().forEachOrdered(System.out::println);
		
	}
}