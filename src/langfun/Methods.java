package langfun;

import java.util.Scanner;


public class Methods {
	 static int sum(int a, int b) {
		System.out.println("the value after the addition" + (a+b));
		return a+b;
	}
	 static float sub( float a, float b) {
		System.out.println("the value after the subraction" + (a-b));
		return a-b;
	}
	
	 static int mul(int a ,int b) {
		System.out.println("the value after the mul " +(a*b));
		return a*b;
	}
	 static int div(int a, int b) {
		System.out.println("the value after the value " + (a/b));
	return a/b;
	
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("enter the value of a");
	int a = sc.nextInt();
	System.out.println("enter the value of b");
	int b = sc.nextInt();
	sum(a,b);
	mul(a,b);
	sub(a,b);
	div(a,b);
				

	}

	
}
