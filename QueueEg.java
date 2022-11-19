package collectionEg;
import java.util.*;
public class QueueEg {

	public static void main(String[] args) {
		PriorityQueue<Integer> q=new PriorityQueue<Integer>() ;
		q.add(5);
		q.add(3);
		q.add(2);
		q.add(1);
		q.add(9);
		System.out.println("Head : "+q.element());
		System.out.println("Head : "+q.peek());
		System.out.println("Iterating : ");
		System.out.println(q);
		Iterator<Integer> itr=q.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		q.remove();
		q.poll();
		System.out.println("Iterating : ");
		Iterator<Integer> itr2=q.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
