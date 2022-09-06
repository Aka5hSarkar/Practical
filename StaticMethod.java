package JavaClass;

public class StaticMethod {
	int rollno;
	String name;
	float fee;
	//static variable
	//static String clg="srm";
	static String clg;
	
	//constructor
	StaticMethod(int rollno,String name,float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	//static method
	static void change() {
		
		clg="itc";
	}
	//method
	void show() {
		System.out.println(rollno +" "+name+" "+fee+" "+clg);
	}
	//new class
	class StaticMethod2{
		public static void main(String[] args) {
			StaticMethod.change();
			StaticMethod s1=new StaticMethod(2,"akash",1000);
			StaticMethod s2=new StaticMethod(3,"bikash",1200);
			s1.show();
			s2.show();
			
		}
	}
}
