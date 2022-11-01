package wrapperClass;

import java.util.ArrayList;

public class ArrayListAutoboxingAndUnboxing {

	public static void main(String[] args) {
		//Autoboxing
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(5);
		a1.add(6);
		System.out.println("ArrayList : "+a1);
		//unboxing
		int n=a1.get(0);
		System.out.println(n);
		
	}

}
