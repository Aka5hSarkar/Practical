package collectionEg;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListEg1 {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Akash");
		ll.add("Bikash");
		ll.add("Arnab");
		ll.add("Sagar");
		ll.add("Dev");
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
