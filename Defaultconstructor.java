package JavaClass;

public class Defaultconstructor {
String name;
int age;
void show() {
	System.out.println(age + " "+name);
}
public static void main(String[] args) {
	Defaultconstructor obr=new Defaultconstructor();
	Defaultconstructor obr1=new Defaultconstructor();
	obr.show();
	obr1.show();
}
}
