package Seesion4;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.HashMap;

public class Examplehashtable {

	public static void main(String[] args) {
		
		Map<Integer, String> hmap = new HashMap<Integer, String>(); 
		
		hmap.put(11, "Apple");
		hmap.put(12, "Banana");
		hmap.put(13, "Cherry");
		hmap.put(14, "Lichi");
		hmap.put(15, "Mango");
		
		Map<Integer, String> result = hmap.entrySet()
				.stream().filter(map -> map.getKey().intValue() <= 14)
				.collect(Collectors.toMap(map -> map.getKey(),
						map -> map.getValue()));
		System.out.println("Key and value is been found: " + result);

	}
}
