package LogicalStatements;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("ATM menu");
		System.out.println("Choose button");
		double balance = 10000;
		int amount = Sc.nextInt();

		switch (amount) {
		case 1:
			System.out.println("Bank balance:" + balance);
			break;
		case 2:
			System.out.println("Deposit amount");
			double deposit = Sc.nextDouble();
			balance = balance + deposit;
			System.out.println("Deposit:" + balance);
			break;
		case 3:
			System.out.println("With draw amount");
			double withdraw = Sc.nextDouble();
			if (withdraw <= balance) {

				balance = balance - withdraw;
				System.out.println("total balance:" + balance);
			}
			break;
		case 4:
			System.out.println("Exit");
			break;
		default:
			System.out.println("invalid");

		}

	}
}
