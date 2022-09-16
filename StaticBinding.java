package JavaClass;
/*//variables have a type
public class StaticBinding {
int a;//its a integer type of variable
//reference has a type
StaticBinding s;//type is StaticBinding
//object has a type
StaticBinding sb=new StaticBinding();
}*/
class StaticBinding{
	private void show () {
		System.out.println("akash");
	}
	public static void main(String[] args) {
		StaticBinding obj=new StaticBinding();
		obj.show();
	}
}
