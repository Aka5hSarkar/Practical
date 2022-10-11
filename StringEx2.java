package JavaClass;

public class StringEx2 {
	static void show() {
		char[] arr= {'j','a','v','a'};
		String s=new String(arr);
		System.out.println("the value is : "+s);
		System.out.println(arr);
	}
	static void myFunction() {
		String m="akash";
		String n="bikash";
		String o=new String("bikash");	
	}

	public static void main(String[] args) {
		show();
		myFunction();

	}

}
