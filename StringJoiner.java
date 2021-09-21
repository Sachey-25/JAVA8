package day5;

public class StringJoiner {

	public static void main(String[] args) {
		StringJoiner joinNames = new StringJoiner(); 
		//Passing the comma and sqaure brackets as a delimiter
		
		//Add value to String Joiner
		joinNames.add("Sachin");
		joinNames.add("Pratik");
		
		//Creating StringJoiner with : delimter
		StringJoiner JoinName = new StringJoiner();
		//Add value to String Joiner
		
		joinNames.add("Peter");
		joinNames.add("John");	
		
		//Merging two stringJoiner
		StringJoiner merge = joinNames.merge(JoinName);
		System.out.println(merge);
		
		System.out.println("-------------------------");
		StringJoiner object = new StringJoiner(",");
		//Printing for empty
		System.out.println("object");
		//Printing the Default empty value
		object.setEmptyValue("Is is Empty");
		
		//Return to length of the stringJoiner
		int length = object.length();
		System.out.println("Length" + length);
		//Return to string type
		String str = object.toString();
		System.out.println(str);
		

		
	}

	private void setEmptyValue(String string) {
		// TODO Auto-generated method stub
		
	}

}
