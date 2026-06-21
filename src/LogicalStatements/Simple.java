package LogicalStatements;

import java.util.Scanner;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter number");
		int a = Sc.nextInt();
		System.out.println("Enter number");
		int b= Sc.nextInt();
		System.out.println("Enter operator");
		System.out.println("+,-,*,/");
		char op = Sc.next().charAt(0);
		
		if(op == '+') {
			System.out.println(a+b);
		}else if(op == '-') {
			System.out.println(a-b);
		}else if(op == '*') {
			System.out.println(a*b);
		}else if(op == '/') {
			System.out.println(a/b);
		}else {
			System.out.println("invalid");
		}

	}

}
