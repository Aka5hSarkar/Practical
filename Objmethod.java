package JavaClass;

public class Objmethod {
int age;
String name;
 void input(int a,String n) {//insert records method 1 
 age=a;
 name=n;
 }
 void display() {
	 System.out.println(age + " "+ name);
 }}

class objectmethod1{
	public static void main(String[] args) {
	//initializing object by method
	Objmethod obr=new Objmethod();
	Objmethod obr2=new Objmethod();
	obr.input(23, "akash");
	obr2.input(24, "sagar");
	//print it
	obr.display();
	obr2.display();
	}}
