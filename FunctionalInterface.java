package collectionEg;

public interface FunctionalInterface {
	int add(int a,int b);
}
class LambdaEg{
	public static void main(String[] args) {
		FunctionalInterface obj=(a,b)->{System.out.println(a*b);return a+b;};
		System.out.println(obj.add(5, 6));
	}
}
