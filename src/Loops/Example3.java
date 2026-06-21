package Loops;

import java.util.Scanner;

public class Example3 {
	static void show(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
			System.out.println(i);

		}
		System.out.println("sum:" + sum);

	}
	static void display(int n) {
		int fact = 0;
		for(int i = 0;i<=n;i++) {
			fact = fact*i;
			System.out.println(i);
		}
		System.out.println("Factrial:" + fact);
	}

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter number");
		int a = Sc.nextInt();

		show(a);
		display(a);

	}

}
