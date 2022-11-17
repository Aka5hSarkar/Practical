package collectionEg;
import java.util.Vector;
public class VectorEg {

	public static void main(String[] args) {
		Vector<Integer> vc1=new Vector<Integer>(4);//creating Vector with 4 capacity
		//adding elements to the Vector
		vc1.add(1);
		vc1.add(4);
		vc1.add(5);
		vc1.add(2);
		System.out.println(vc1);
		System.out.println("Size : "+vc1.size());//checking size
		System.out.println("Capacity : "+vc1.capacity());//checking capacity
		//adding more elements
		vc1.add(5);
		vc1.add(8);
		System.out.println(vc1);
		System.out.println("New Size : "+vc1.size());//checking new size
		//new capacity=((old capacity*3)/2)+1
		System.out.println("New Capacity : "+vc1.capacity());//checking new capacity
		System.out.println(vc1.contains(3));//checking if 3mis present in the vector
		System.out.println(vc1.firstElement());//getting first element
		System.out.println(vc1.lastElement());//getting last element
		System.out.println(vc1.indexOf(5));//getting index of specific element
	}

}
