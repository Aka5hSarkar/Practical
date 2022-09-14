package JavaClass;
//creating parent class
class Exam{
	int marks() {
		return 0;
	}
}
//creating child classes
class Comp extends Exam{
	int marks() {
		return 80;
	}
}
class math extends Exam{
	int marks() {
		return 70;
	}
}
class science extends Exam{
	int marks() {
		return 60;
	}
}

public class OverridingEg {

	public static void main(String[] args) {
		Comp c=new Comp();
		math m=new math();
		science s=new science();
		System.out.println(c.marks());
		System.out.println(m.marks());
		s.marks();
	}

}
