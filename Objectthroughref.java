package JavaClass;

public class Objectthroughref {
 //field
 int age;
 String name;
}
//creating another class
class Objectthroughref1{
	//main method
	public static void main(String[] args) {
		//creating object
		Objectthroughref obr=new Objectthroughref();
		obr.age=50;
		obr.name="akash";
		System.out.println(obr.age + " "+ obr.name);
	}
}