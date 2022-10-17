package exception;

public class ExceptionExample {
	void show() {
		String a="something";
		System.out.println(a);
		try {
			int num=50/0;//ArithmeticException
			System.out.println(num);
			String s="akash";
			System.out.println(s.length());
			String[] str=new String[3];
			str[4]="bikash";//ArrayIndexOutOfBoundException
			int m=Integer.parseInt(s);//number format exception
			System.out.println(m);
		}catch(Exception e) {
			System.out.println(e);
		}
		String b="ok";
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		ExceptionExample obj=new ExceptionExample();
		obj.show();
		}

}
