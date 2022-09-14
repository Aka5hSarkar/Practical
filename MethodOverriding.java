package JavaClass;


//parent class
public class MethodOverriding {
 void run() {
	 System.out.println("runnig mode on");
 }
}//creating child class
class ChildOverriding extends MethodOverriding {
	//creating same name method as it was in the parent class
	void run() {
		System.out.println("runnig mode off");
	}
	public static void main(String[] args) {
		ChildOverriding obj=new ChildOverriding();
		obj.run();
	}
}