package JavaClass;

public  interface DemoInterface {//interface declaration
 void show();
}
class DemoClass implements DemoInterface{//1st implementation
	public void show() {
		System.out.println("show");
	}
}
class DemoClass2 implements DemoInterface{//2nd implementation
	public void show() {
		System.out.println("show2");
	}
	public static void main(String[] args) {
		DemoInterface obj=new DemoClass();
		DemoInterface  obj2=new DemoClass2();
		obj.show();
		obj2.show();
		}
}