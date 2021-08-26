
interface Message_pass{
	Message getMessage(String msg);	
}
class Message{
	Message(String msg){
		System.out.println(msg);
	}
}
public class RefrencetoConstructor {
	public static void main(String[] args) {		
		//Creating an Object/Instance
		Message_pass instance = Message::new; //Reference to Data
		instance.getMessage("Hello, Good-Afternoon!!!!");
	}
}