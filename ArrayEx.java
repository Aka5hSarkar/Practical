package array;

public class ArrayEx {
	public static void main(String[] args) {
		int a[] =new int[3];//declaration of array and object creation
		//initialization
		//a[0]=10;
		//a[1]=20;
		//a[2]=30;
		//System.out.println(a);
		int b[]= {10,20,30};//initializing and object creation
		//Traversing
		for (int i=0;i<b.length;i++) {
			//System.out.println(a[i]);
			System.out.println(b[i]);
		}
		//traversing array using for each loop
		for (int i:b) {
			System.out.println(i);
		}
	}
}
