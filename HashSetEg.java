package collectionEg;
import java.util.HashSet;
import java.util.Set;
public class HashSetEg {

	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();//creating HashSet
		//adding elements
		set.add("Pen");
		set.add("Pencil");
		set.add("Pen");
		set.add("Hat");
		System.out.println("Originl : "+set);
		set.remove("Hat");//removing specific element
		System.out.println("After invoking remove : "+set);
		HashSet<String> set2=new HashSet<String>();//creating 2nd HashSet
		//adding elements 
		set2.add("Akash");
		set2.add("Bikash");
		System.out.println("New Set : "+set2);
		set.addAll(set2);//adding 2nd set to 1st set
		System.out.println("Updated 1st Set : "+set);
		set.removeAll(set2);//removing 2nd set elements from 1st set
		System.out.println("Updated set : "+set);
		set.clear();//clearing the set
		System.out.println("Updated set : "+set);
		
	}

}
