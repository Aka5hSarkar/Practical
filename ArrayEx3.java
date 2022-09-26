package array;
//return an array from the method
public class ArrayEx3 {
	public static void main(String[] args) {
		int arr[]=printArray();//calling the method
		//traversing the array
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	//creating method which will return array
	static int[] printArray() {
		return new int[] {1,2,3,4,5};//anonymous array
	}
	
	
				
}
