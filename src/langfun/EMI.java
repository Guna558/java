package langfun;

import java.util.Scanner;

public class EMI {
	static double getemi(double amount, int months) {
		return (amount / months);
	}

	static double getinterst(double amount, int rate) {
		return ((amount * rate) / 100);
	}

	static double gettotalamount(double amount, float interst) {
		return (amount + interst);
	}

	static double getgst(double amount, float percentange) {
		return ((amount * percentange) / 100);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter amount");
		double n1 = Sc.nextDouble();
		System.out.println("Enter months");
		int n2 = Sc.nextInt();
		System.out.println("EMI:" + getemi(n1, n2));

		double n3 = Sc.nextDouble();
		System.out.println("Enter rate");
		int n4 = Sc.nextInt();
		System.out.println("INTERST:" + getinterst(n1, n4));

		double n5 = Sc.nextDouble();
		System.out.println("Enter interst");
		float n6 = Sc.nextFloat();
		System.out.println("TOTAL AMOUNT:" + gettotalamount(n5, n6));

		double n7 = Sc.nextDouble();
		System.out.println("Enter percentage");
		float n8 = Sc.nextFloat();
		System.out.println("GST:" + getgst(n7, n8));

	}

}
