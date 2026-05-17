package langfun;
import java.util.Scanner;

public class Bank {
	static Scanner Sc = new Scanner(System.in);
	int credit() {
		System.out.println("Enter amount to Withdraw:");
		int creadit = Sc.nextInt();
		return creadit;
		
	}
	int deposit() {
		System.out.println("Enter Amount to Deposit:");
		int deposit = Sc.nextInt();
		return deposit;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank();
		int withdraw = b.credit();
		int deposit = b.deposit();
		System.out.println("Current Balance:" + (withdraw-deposit));

	}

}
