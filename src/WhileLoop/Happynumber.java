package WhileLoop;

import java.util.Scanner;

public class Happynumber {
	static boolean happy(int n) {
		// boolean status = true;
		int r = 0;

		int sum;
		while (n != 1 && n != 4) {
			sum = 0;
			while (n > 0) {
				r = n % 10;
				r = r * r;
				sum = sum + r;
				n = n / 10;

			}
			n = sum;

		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = Sc.nextInt();
		boolean status = happy(n);

		if (status) {
			System.out.println("Happy number");
		} else {
			System.out.println("Not happy number");
		}

	}

}
