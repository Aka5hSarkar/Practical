package collectionEg;
import java.util.*;
public class LinkedHashmapEg {

	public static void main(String[] args) {
		//linkedhashmap maintains insertion order
		LinkedHashMap< Integer,String>map = new LinkedHashMap<Integer,String>();
		map.put(101, "Mango");
		map.put(108, "Orange");
		map.put(105, "Banana");
		map.put(103, "Grapes");
		map.put(105, "Banana");
		map.put(null, null);
		map.put(102, null);
		map.put(null, "Apple");
		map.putIfAbsent(102,"CustardApple");
		map.putIfAbsent(101, "Watermelon");
		for (Map.Entry m : map.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());	
		}
		map.remove(103);
		System.out.println(map);
		//only keys
		System.out.println("keys : "+map.keySet());
		//only values
		System.out.println("values : "+map.values());
		//key-value
		System.out.println("entries : "+map.entrySet());
	}

}
