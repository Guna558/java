package Loops;

import java.util.Scanner;

public class Fiboonacci {
	static void isfiboonacci(int n) {
		int n1 = 0;
		int n2 = 1;
		int n3 ;
		System.out.print(n1+ " " +n2);
		for(int i = 0;i<=n;i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1=n2;
			n2=n3;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = Sc.nextInt();
		isfiboonacci(n);
		

	}

}
