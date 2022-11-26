package collectionEg;
import java.util.*;
public class TreeMapEg {

	public static void main(String[] args) {
		//treemap follow the ascending insertion order
		//it will not accept any null keys or null values
		TreeMap <Integer,String> map=new TreeMap<Integer,String>();
		map.put(101, "Mango");
		map.put(108, "Orange");
		map.put(105, "Banana");
		map.put(103, "Grapes");
		map.put(105, "Banana");
		for (Map.Entry m : map.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());	
		}
	}

}
