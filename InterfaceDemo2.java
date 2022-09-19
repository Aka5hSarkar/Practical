package JavaClass;
//achieve multiple inheritance by interface  
public interface InterfaceDemo2 {//1st interface
	void show();
}
interface InterfaceDemo3{//2nd interface
	void print();
}
class MultiIN implements InterfaceDemo2,InterfaceDemo3{
	public void show () {
		System.out.println("hi");
	}
	public void print() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		MultiIN obj=new MultiIN();
		obj.show();
		obj.print();
	}
}
