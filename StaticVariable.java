package JavaClass;

public class StaticVariable {
int rollno;
String name;
float fee;
//static variable
static String clg="srm";
//constructor
StaticVariable(int rollno,String name,float fee){
	this.rollno=rollno;
	this.name=name;
	this.fee=fee;
}
//method
void show() {
	System.out.println(rollno +" "+name+" "+fee+" "+clg);
}
//new class
class StaticVaribale2{
	public static void main(String[] args) {
		StaticVariable s1=new StaticVariable(2,"akash",1000);
		StaticVariable s2=new StaticVariable(3,"bikash",1200);
		s1.show();
		s2.show();
	}
}

}
