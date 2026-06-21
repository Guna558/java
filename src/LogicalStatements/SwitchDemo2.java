package LogicalStatements;

import java.util.Scanner;

public class SwitchDemo2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter value");
		int a = Sc.nextInt();
		System.out.println("Enter value");
		int b = Sc.nextInt();
		System.out.println("Enter operator");
		System.out.println("+,-,*,/");
		char operator = Sc.next().charAt(0);
		
		switch(operator) {
		case'+':
			System.out.println("sum:" +(a+b));
			break;
		case'-': 
			System.out.println("diff:"+(a-b));
			break;
		case'*':
			System.out.println("mul:" + (a*b));
			break;
		case'/':
			System.out.println("div:" +(a/b));
			break;
			default:
				System.out.println("invalid");
		
			
		
		}

	}

}
