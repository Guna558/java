package Loops;

import java.util.Scanner;

public class Perfectnumber {
	static boolean isperfect(int n) {
		boolean status = false;
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;

			}
		}
		System.out.println("Sum:" + sum);
		if (n == sum) {
			status = true;

		}

		return status;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = Sc.nextInt();

		boolean status = isperfect(a);
		if (status) {
			System.out.println("Perfect number");

		} else {
			System.out.println("Not perfect number");
		}

	}

}
