package JavaClass;

//creating the parent class
class Shape1{
	
	//parent class method
	void print() {
		System.out.println("its a circle");
	}
}
//creating the child class
class Size1 extends Shape1{
	
	// first child class method
	void print () {
		System.out.println("its a triangle");
	}
	
	//second child class method
	void show() {
		print();//invoking the child class print method into the show method
		super.print();/*invoking the parent class print method by super keyword
		                in the show method*/
		
	}
}

public class SuperMethod {
public static void main(String[] args) {
	Size1 obj=new Size1();////creating the object of child class Size1
	obj.show();//calling the show method from the child class object
}
}
