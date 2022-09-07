package JavaClass;

public class CopyCons {
	int age;
	String name;
//constructor initiate
	CopyCons(int a,String b){
		age=a;
		name=b;
	}
	//constructor to initialize another object
	CopyCons(CopyCons c){
		age=c.age;
		name=c.name;
	}
	//method
	void show() {
		System.out.println(age+" "+name);
	}
}
class Copycons2{
	public static void main(String[] args) {
		CopyCons c1=new CopyCons(23,"akash");
		CopyCons c2=new CopyCons(c1);
		c1.show();
		c2.show();
	}
}

