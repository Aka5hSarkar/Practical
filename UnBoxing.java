package wrapperClass;
//wrapper to primitive
public class UnBoxing {

	public static void main(String[] args) {
		Integer a=new Integer(5);
		int b=a.intValue();//converting integer into int
		Integer j=a;//now compiler will write int.value() Unboxing
		System.out.println(a+" "+b+" "+j);
	}

}
