package collectionEg;
//LinkedHashSet inherits the HashSet class and implements the Set interface
import java.util.*;
public class LinkedListHashSetEg {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		//it allows null values
		lhs.add(null);
		lhs.add("Akash");
		lhs.add("Dev");
		System.out.println(lhs);

	}

}
