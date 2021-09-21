package day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Coders{
	int id;
	String name;
	String city;
	
//Initialize the data
public Coders(int id,String name, String city) {
	this.id=id;
	this.name=name;
	this.city=city;
}
}
class calculations{
	int id;
	String name;
	int price;
	
//Initialize the data
public calculations(int id,String name, int price) {
	this.id=id;
	this.name=name;
	this.price=price;
}
}
public class JavaCollectors {
	public static void main(String[] args) {
		//Pass the data to the list
		List<Coders> coders = new ArrayList<Coders>();
		coders.add(new Coders(101,"Sachin","Bangalore"));
		coders.add(new Coders(102,"Fountain","NewDelhi"));
		coders.add(new Coders(103,"Surya","Channai"));
		coders.add(new Coders(104,"Demon","Hydrabad"));
		coders.add(new Coders(105,"Anonymous","Kolkatta"));
		
		List<String> coderList = coders.stream()
				.map(instance -> instance.name)//Fetch the data
				.collect(Collectors.toList());
		System.out.println(coderList);
		
		//I would like to add the collectors. sumMethod
		//Pass the data to the list
				List<calculations> calc = new ArrayList<calculations>();
				calc.add(new calculations(101,"Sachin",12000));
				calc.add(new calculations(102,"Fountain",13000));
				calc.add(new calculations(103,"Surya",14000));
				calc.add(new calculations(104,"Demon",11000));
				calc.add(new calculations(105,"Anonymous",10000));
		System.out.println("--------------------------------");
		Double SumPrices =calc.stream()
		//Collecting as list
		.collect(Collectors.summingDouble(instance -> instance.price)); 
		System.out.println("Sum of prices " + SumPrices);
		
		Integer sumId=calc.stream()
				.collect(Collectors.summingInt(instance -> instance.id));
		System.out.println("Sum of Id's " + sumId);
		
		//Counting the items
		
		Long noOfElements = calc.stream().collect(Collectors.counting());
		System.out.println("Total Elements" + noOfElements);
		
		Stream <String> search = Stream.of("Apple","banana","orange");		
		ConcurrentSkipListMap <Integer, Long> map = search.collect(Collectors.
				groupingByConcurrent(String::length,
						ConcurrentSkipListMap ::new,
				Collectors.counting()));
		System.out.println(map);
	}
}

