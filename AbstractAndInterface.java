package JavaClass;
//interface
interface NewInterface{
	void print();//abstract method
	void display();//abstract method
	void show();//abstract method
}
//abstract parent class
abstract class AbsClass implements NewInterface{
	public void print() {//overriding the print method
		System.out.println("its in the print method");
	} 
}
//child class
public class AbstractAndInterface extends AbsClass {
	public void display() {//overriding the display method
		System.out.println("its in the display method");
	}
	public void show() {//overriding the show method
		System.out.println("its in the show method");
	}
	public static void main(String[] args) {
		NewInterface obj=new AbstractAndInterface();
		obj.print();
		obj.display();
		obj.show();
			
	}
}
