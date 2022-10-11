package JavaClass;
import java.util.Scanner;
public class StringTest {
	static void show() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two strings : ");
		String a=sc.next();
		String b=sc.next();
		System.out.println(a.length()+b.length());
		System.out.println((a.compareTo(b)>0)? "yes":"no");
		System.out.println(a.substring(0, 4).toUpperCase()+a.substring(2)+" "+
		b.substring(0, 1).toUpperCase()+b.substring(1));
		if (a.equals(b)) 
			System.out.println("equal strings");
		else
			System.out.println("not equal strings");
	}
	

	public static void main(String[] args) {
		
		show();
	}

}
