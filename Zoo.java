package JavaClass;
 class Zoo1{
	 // we can't override data members
	 int a=10;
	 void bark() {
		 System.out.println("barking");
	 }
 }
class Cat extends Zoo1{
	int a=20;
	void bark() {
		System.out.println("meow");
	}
}
class Dog extends Zoo1{
	void bark() {
		System.out.println("baff");
	}
}
public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoo1 z;
		z=new Cat();
		z.bark();
		System.out.println(z.a);
		z=new Dog();
		z.bark();
		z=new Zoo1();
		z.bark();
		
	}

}
