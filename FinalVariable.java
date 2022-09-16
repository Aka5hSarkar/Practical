package JavaClass;

final public class FinalVariable {
	final  int value=60;//final variable
	int value(final int a) {
		return a++;//we can't change the final parameter
	}
	 final void display() {//final method
		//we can't change the value of final variable
		 value=50;//compilation error
		System.out.println(value);
	}
class FinalMethod extends FinalVariable{//we can't inherit the final class
										//it will give compilation error
	//we can't override the final method
	void display() {//compilation error
		System.out.println(value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalVariable fv=new FinalVariable();
		fv.display();
	}

}}
