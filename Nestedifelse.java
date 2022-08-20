package JavaClass;
import java.util.Scanner;

public class Nestedifelse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter your city name : ");
		String address=sc.nextLine();
		if(address.endsWith("India")){
			if(address.contains("Dunlop")) {
				System.out.println("your city is Dunlop");
			}else if(address.contains("Newtown")) {
				System.out.println("your city is newtown");
				
			}else {
				System.out.println(address.split(",")[0]);
			
			}
		
		}else {
			System.out.println("you are from outside India");
		}

	}

}
