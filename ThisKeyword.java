package JavaClass;

public class ThisKeyword { //outer class
	int rollno;
	String name;
	float fee;
	
	//constructor
	ThisKeyword(int rollno,String name,float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	//method
	void show() {
		System.out.println(rollno +" "+name+" "+fee);
	}
	//new class
	class New{ //inner class
		public static void main(String[] args) {
			ThisKeyword s1=new ThisKeyword(2,"akash",1000);
			ThisKeyword s2=new ThisKeyword(3,"bikash",1200);
			s1.show();
			s2.show();
		}
	}
}
