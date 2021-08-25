import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Product{
	int id;
	String Name;
	float price;
	public Product(int id, String Name, float price)
	{
		super();
		this.id=id;
		this.Name=Name;
		this.price=price;
	}
}
public class lambdasort {
	public static void main(String[] args) {
		//Create a list to store the data
		List<Product> list = new ArrayList<Product>();
		list.add(new Product (101,"Nokia",25000.00f));
		list.add(new Product (102,"Samsung",35000.00f));
		list.add(new Product (103,"Moto",38000.00f));		
	//Lambda Expressions - Sorting the data with their appropriate attribute , id, name, price
	Collections.sort(list,(para1, para2) -> {
		return para1.Name.compareTo(para2.Name);	
	});
	// Using the looping concept to read the data
	for(Product p:list){
		System.out.println(p.id + "  "+ p.Name + "  " + p.price);
	}
	}
}