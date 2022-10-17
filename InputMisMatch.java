package exception;
import java.util.*;

public class InputMisMatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter two numbers");
			int a=sc.nextInt();
			int b=sc.nextInt();
			sc.close();
			System.out.println(a/b);
		}catch(InputMismatchException e) { 
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
