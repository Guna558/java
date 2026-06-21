package LogicalStatements;

import java.util.Scanner;

public class Student {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Result");
		System.out.println("p,a,f");
		char marks = Sc.next().charAt(0);
		
		switch(marks) {
		case 'p':System.out.println("pass");
		break;
		case'a': System.out.println("absent");
		break;
		case'f':System.out.println("fail");
		break;
		default:System.out.println("Invalid");
		}

	}

}
