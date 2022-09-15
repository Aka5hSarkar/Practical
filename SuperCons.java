package JavaClass;
//parent class
class Shape2{
	int age;
	String name;
	//parent constructor
	Shape2(int age,String name){
		this.age=age;
		this.name=name;
		//System.out.println("hello");
	}
}
//child class
class Size2 extends Shape2{
	//child constructor
	Size2(int age,String name){
	/*invoke the immediate parent class constructor in the child class constructor 
	by super keyword*/ 
		super(age,name);
		this.age=age;
		this.name=name;
		//System.out.println("hi");
	}
	String  displayName(){
		return name; 
	}
	int displayAge() {
		return age;
	}
	
}
public class SuperCons {
public static void main(String[] args) {
	
//creating the object of child class Size2
 Size2 obj=new Size2(23,"akash");
 System.out.println(obj.displayName()+" "+obj.displayAge());

}}
