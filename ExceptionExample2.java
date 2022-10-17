package exception;

public class ExceptionExample2 {

	public static void main(String[] args) {
		try {
			int n=50/0;//Arithmetic Exception
			System.out.println(n);
			int arr[]=new int[3];
			arr[4]=5;//ArrayIndexOutOfBoundException
			System.out.println(arr[4]);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("It is finally keyword");
		}
	}

}
