package Assignments;

import com.innovtion.shapes.Area;

class Operations{
	int square(int a) {
	return a*a;
	}
}


public class Circle {
float pi=3.14f;
Operations ref=new Operations();
float area(int radius){
	
	int square1=ref.square(radius);
	return pi*square1;
}
public static void main(String args[]) {
	Circle c=new Circle();
	System.out.println(c.area(6));
}

}
