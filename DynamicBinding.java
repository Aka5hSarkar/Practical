package JavaClass;
class Example{
	void show() {
		System.out.println("fisrt");
	}
}

public class DynamicBinding extends Example {
 void show() {
	 System.out.println("second");
 }
 public static void main(String[] args) {
	Example e=new DynamicBinding();
	e.show();
}
}
