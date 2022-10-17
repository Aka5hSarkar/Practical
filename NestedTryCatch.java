package exception;

public class NestedTryCatch {

	public static void main(String[] args) {
		try {//outer try block 
			try { //inner try block 1
				System.out.println("Dividing by zero");
				int num=25/0;//ArithmeticException
			}catch(Exception e) {//catch block of inner try block 1
				System.out.println(e);
			}
			try {  //inner try block 2
				System.out.println("Creating array");
				int arr[]=new int[3];
				arr[4]=3;//ArrayIndexOutOfBoundException
			}catch (Exception e) {//catch block of inner try block 2
				System.out.println(e);
			}
		}catch(Exception e) {//catch block of outer try block 
			System.out.println("exceptions are handled");
		}System.out.println("END");//sop outside try-catch block
	}

}
