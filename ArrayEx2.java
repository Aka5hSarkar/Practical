package array;
//anonymous array in java
public class ArrayEx2 {

	public static void main(String[] args) {
		
		display(new int[] {1,2,3,4,5,6});
	}
	//creating an method which takes array as parameter
	static void display(int arr[]) {//no need to declare an array while passing the array as parameter
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
