package collectionEg;
import java.util.*;
public class ArrayDequeEg {
	public static void main(String[] args) {
		Deque<String> dq=new ArrayDeque<String>();
		dq.add("Akash");
		dq.add("Bikash");
		dq.add("Dev");
		System.out.println("Old Deque : "+dq);
		dq.addFirst("Hello");
		dq.addLast("World");
		System.out.println("New Dque : "+dq);
		dq.removeFirst();
		dq.removeLast();
		System.out.println("After Removel : "+dq);
	}
}
