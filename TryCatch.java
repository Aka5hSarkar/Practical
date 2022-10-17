package exception;

public class TryCatch {

	public static void main(String[] args) {
		//try -- catch block
		try {
			int num=25/0;//may exception occur
			System.out.println("run");//this line won't execute
		}//catch (ArithmeticException e) {//handling exception
		 catch (Exception e) {
			System.out.println(e);//printing the exception
			 System.out.println("number can't be divided by zero");//customized sop
		}
		System.out.println("still running");
	}

}
