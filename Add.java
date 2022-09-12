package Practice;

public class Add {
 static int add(int a,int b) {
		 return a+b;
	 }
 //overloading method by changing the number of arguments
 static int add(int a,int b,int c) {
	 return a+b+c;
 }
 //overloading method by changing the data type of arguments
 static float add(float a,float b) {
	 return a+b;
 }
 //type promotion
 static long add(long a,int b) {
	 return a+b;
 }
}
class Addition{
	public static void main(String args[]) {
		System.out.println(Add.add(5, 6));
		System.out.println(Add.add(5, 4, 7));
		System.out.println(Add.add(6.5f, 4.3f));
		System.out.println(Add.add(466l,2));
	}
}