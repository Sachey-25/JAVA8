package Seesion4;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

class Items{
	int id;
	String Name;
	float price;	
	public Items(int id, String Name, float price) {
		this.id=id;
		this.Name=Name;
		this.price=price;
	}
}
public class streammaxandmin {

	public static void main(String[] args) {
		//Create a list
		List<Items> productsList = new ArrayList<Items>();	
				//Add the item to the productlist	
		productsList.add(new Items(101,"Nokia",35000f));
		productsList.add(new Items(102,"Samsung",35000f));
		productsList.add(new Items(103,"MI",40000f));
		productsList.add(new Items(104,"VIVO",35000f));
		productsList.add(new Items(105,"Oppo",34000f));
				
		//Max() method to get max product price
		Items product_main = productsList.stream()
				.max((product_one, product_two)->
				product_one.price > product_two.price ? 1:-1).get();
		System.out.println(product_main.price);
		
		//min method to get product price
		Items product_min = productsList.stream()
				.min((product_one, product_two)->
				product_one.price > product_two.price ? 1:-1).get();
		System.out.println(product_min.price);	
	}	
}
