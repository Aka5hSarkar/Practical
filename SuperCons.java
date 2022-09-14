package JavaClass;
//parent class
class Shape2{
	//parent constructor
	Shape2(){
		System.out.println("hello");
	}
}
//child class
class Size2 extends Shape2{
	//child constructor
	Size2(){
	/*invoke the immediate parent class constructor in the child class constructor 
	by super keyword*/ 
		super(); 
		System.out.println("hi");

	}
}
public class SuperCons {
public static void main(String[] args) {
	
//creating the object of child class Size2
 Size2 obj=new Size2();

}}
