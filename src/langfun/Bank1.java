package langfun;

import java.util.Scanner;

public class Bank1 {
	double balance= 10000;
	 void creadit(double amount) {
		System.out.println("Enter creadit amount:" + balance);
		balance = balance + amount;
	}
	void withdraw(double amount) {
		System.out.println("Enter withdraw amount:"+balance);
		balance = balance - amount;
	}
	void getbalance() {
		System.out.println("Enter balance:" + balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank1 b = new Bank1();
		b.getbalance();
		System.out.println("The current balance:" + b.balance);
		Scanner Sc = new Scanner(System.in);
		System.out.println("How much amount withdraw");
		double n2 = Sc.nextDouble();
		System.out.println("How much amount creadit");
		double n1 = Sc.nextDouble();
		b.creadit(n1);
		b.withdraw(n2);
		

	}
	
}
