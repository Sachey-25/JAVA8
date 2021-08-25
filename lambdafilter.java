import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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
public class lambdafilter {

	public static void main(String[] args) {		
		//Create the list to store the data
		List<Product> list = new ArrayList<Product> ();
		list.add(new Product(101, "Samsung M31", 19000f));
		list.add(new Product(102, "Iphone 7", 89000f));
		list.add(new Product(103, "MI 10i", 25000f));
		list.add(new Product(101, "Redmi note 7pro", 15000f));
		list.add(new Product(101, "Oppo", 19000f));
		list.add(new Product(101, "Vivo", 17000f));
		list.add(new Product(101, "Nokia", 21000f));

		//using lambda to filter the data
		Stream<Product> filtered_data = list.stream().filter(p->p.price>15000);
		//Using the lambda to iterate through collection
		System.out.println("The values are filtered with the name and price");
		filtered_data.forEach(
				product ->System.out.println("Name of the product: " + product.Name +" " +
							"Price of the product: "+product.price)
	);
}
}
