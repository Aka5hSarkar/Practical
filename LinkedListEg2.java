package collectionEg;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListEg2 {

	public static void main(String[] args) {
		LinkedList<String> ll1=new LinkedList<String>();//list 1
		//adding elements in the list 1
		ll1.add("Akash");
		ll1.add("Bikash");
		System.out.println(ll1);
		ll1.add(1, "Sagar");//adding element at specific index
		System.out.println(ll1);
		LinkedList<String> ll2=new LinkedList<String>();
		//adding elements in the list 2
		ll2.add("aa");
		ll2.add("bb");
		System.out.println(ll2);
		ll1.addAll(ll2);//adding 2nd list elements to the 1st list,it will add at the end
		System.out.println(ll1);
		ll1.addAll(1,ll2);//adding 2nd list elements to the 1st list at specific position
		System.out.println(ll1);
		ll1.addFirst("Hello");//adding an element at the 1st position
		System.out.println(ll1);
		ll1.addLast("World");//adding an element at the last position
		System.out.println(ll1);
		ll1.remove("Bikash");//removing specific element from the LinkedList
		System.out.println(ll1);
		ll1.remove(2);//removing specific element on the basis of index number
		System.out.println(ll1);
		ll1.removeFirst();//removing 1st element
		ll1.removeLast();//removing last element
		System.out.println(ll1);//printing the list
		Iterator<String> itr=ll1.iterator();//printing the list using iterator
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}System.out.println();
		for(String val:ll1) {//printing the list using for each loop
			System.out.print(val+" ");
		}System.out.println();
		ll1.removeAll(ll1);//removing all elements form the 1st list
		System.out.println(ll1);
		LinkedList <Integer> ll3=new LinkedList<Integer>();//3rd list
		ll3.add(2);
		ll3.add(4);
		ll3.add(2);
		ll3.add(3);
		ll3.add(4);
		ll3.add(6);
		ll3.add(2);
		System.out.println(ll3);
		ll3.removeFirstOccurrence(2);//removing first occurrence of 2
		System.out.println(ll3);
		ll3.removeLastOccurrence(4);//removing last occurrence of 4
		System.out.println(ll3);
		//reversing the LinkedList
		Iterator<Integer> itr2=ll3.descendingIterator();
		while(itr2.hasNext()) {
			System.out.print(itr2.next()+" ");
		}System.out.println();
		ll3.clear();//clearing the LinkedList
		System.out.println(ll3);
		
	}

}
