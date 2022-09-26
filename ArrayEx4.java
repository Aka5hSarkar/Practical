package array;

public class ArrayEx4 {
	public static void main(String[] args) {
		int [] arr= {1,2,3};
		System.out.println("max number : "+max(arr));
	}
	
	static int max(int a[]) {
		int max=a[0];
		for (int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
}
