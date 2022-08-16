package Operator;

public class OperatorExample {

	public static void main(String[] args) {
		int a = 50;//initialize a
		int b = 20;//initialize b
		
		System.out.println("the numbers are : "+a+" and "+b);
		//arrithmetic operators
		int c=a+b;//addition
		System.out.println("The sum is : "+c);
		int sub=a-b;//substraction
		System.out.println("the substraction is : "+sub);
		int div=a/b;//divison
		System.out.println("the quotient is : "+div);
		int mul=a*b;//mulltiply
		System.out.println("the multiplication is : "+mul);
		int rem=a%b;//modulus
		System.out.println("the remainder is : "+rem);
		//relational & logical operator
		System.out.println(a>b&&a<b);//AND operator,true && false =false
		System.out.println(a>b&&b<a);//AND operator,true && true=true
		System.out.println(a<b||b<a);//OR operator , false || true =true
		//Unary operator
		int post=a++;//postfix increment opeator
		int pre =++a;//prefix increment operator
		int add =post + pre;//additioning
		System.out.println("the addition is : "+add);
	}

}
