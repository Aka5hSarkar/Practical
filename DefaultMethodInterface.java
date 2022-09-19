package JavaClass;

//default & static method using interface
public interface DefaultMethodInterface {
 void print();//abstract method,no need to define method body
 default void show() {//default method
	 System.out.println("default method");
 }
static void staticMethod() {//static method
	System.out.println("static method");
}
}
class NewClass implements DefaultMethodInterface{
	public void print() {//overriding the abstract method
		System.out.println("abstract method is overridden");
	} 
	public static void main(String[] args) {
		DefaultMethodInterface def=new NewClass();
		def.print();
		def.show();
		DefaultMethodInterface.staticMethod();/*calling static method using 
											  interface name*/
			
			
		}
	}
