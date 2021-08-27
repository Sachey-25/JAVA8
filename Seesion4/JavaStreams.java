package Seesion4;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class product{
	int id;
	String Name;
	float price;	
	public product(int id, String Name, float price) {
		this.id=id;
		this.Name=Name;
		this.price=price;
	}
}

public class JavaStreams {

	public static void main(String[] args) {
		//Create a list
		List<product> productsList = new ArrayList<product>(); 	
		
		//Add the item to the productlist		
		productsList.add(new product(101,"Nokia",35000f));
		productsList.add(new product(102,"Samsung",35000f));
		productsList.add(new product(103,"MI",40000f));
		productsList.add(new product(104,"VIVO",35000f));
		productsList.add(new product(105,"Oppo",34000f));
		
		//Create another list to store the price values
		List<Float>productPriceList = 
				productsList.stream().filter(p -> p.price > 25000)
				.map(p->p.price) //Getting the data
				//Collecting the data into the list
				.collect(Collectors.toList()); 
		System.out.println(productPriceList);		
		//for loop exmple
		//In filter we can pass the test expression (Conditions)
		Stream.iterate(1,data -> data+1).filter(data -> data%2==0)
		.limit(10).forEach(System.out::println);
	}	
	//FindMax and min product price	
	// Max() method to get max poduct price
	product Product_one = productsList.stream().max((prod_one,prod_two)
			-> prod_one.price > prod_two.price ? 1:-1).get();
	System.out.print(Product_one.price);
}
	/*productsList.stream()
	.filter(product -> product.price < 45000)
	.forEach(product -> System.out.println(product.name));*/
//Note : Whenever we make use of stream methodology
// we need make use of .filter .map .collector	
		
		//store the data of price from List array created
		/*List<Float> productPriceList = new ArrayList<Float>();
		
		//for loop --> for index iteration
		for(Product product:productsList)
		//filter the data from the list
		//condition check -- if : statement
		if(product.price<35000) {
			//adding price to a productPriceList
			productPriceList.add(product.price);
		}
		//Display the data
		System.out.println(productPriceList);
	}
	
}*/

