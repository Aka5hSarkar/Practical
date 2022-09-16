package JavaClass;
//runtime polymorphism
 class RuntimePoly {
void show() {
	System.out.println("show anything");
}
}
class Abcd extends RuntimePoly{
	void show() {
		System.out.println("show nothing");
	}
	public static void main(String[] args) {
		RuntimePoly t=new Abcd();
		t.show();
	}
}
