package LogicalStatements;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("ENter value");
		int num = Sc.nextInt();

		switch (num) {
		case 101:
			System.out.println("HR");
			break;
		case 102:
			System.out.println("Sales");
			break;
		case 103:
			System.out.println("Finance");
			break;
		case 104:
			System.out.println("IT");
			break;
		default:
			System.out.println("invalid");
		}

	}

}
