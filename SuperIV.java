package JavaClass;

//creating the parent class
class Shape{
	String name="circle";//data member of parent class
	//parent class method
	void print() {
		System.out.println("its a circle");
	}
}
//creating the child class
class Size extends Shape{
	String name="triangle";//data member of child class
	// first child class method
	void show() {
		System.out.println(name);//print the name of child class
		System.out.println(super.name);//print name of parent class using super keyword
	}
	//second child class method
	void print () {
		System.out.println("its a triangle");
		super.print();//invoking the parent class method
	}
}

public class SuperIV{
	public static void main(String[] args) {
		//creating the object of the child class Size
		Size obj=new Size();
		obj.show();//calling the show method from child class object
		obj.print();//calling the print method from child class object
	}
}

