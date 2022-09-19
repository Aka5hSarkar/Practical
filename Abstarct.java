package JavaClass;
//an abstract class which has an abstract,non abstract method and constructor
//parent class
public abstract class Abstarct {
	Abstarct(){
		System.out.println("constructor created ");
	}
 abstract void method();//abstract method
 void show() {//non abstract method
	 System.out.println("show method created ");
 }}
 class ChildAbstract extends Abstarct{//child class
	 void method() {//overriding the abstract method
		 System.out.println("show");
	 }
	 public static void main(String[] args) {
		 Abstarct obj=new ChildAbstract();
		 obj.method();
		 obj.show();
}}
