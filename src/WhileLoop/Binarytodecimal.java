package WhileLoop;

import java.util.Scanner;

public class Binarytodecimal {
	static void decimal(int n) {
		int r =0;
		int decimal =0;
		int a = 1;
		while(n>0) {
			r = n%10;
			decimal = decimal +(r*a);
			a = a*2;
			n = n/10;
		}
		System.out.println(decimal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = Sc.nextInt();
		decimal(n);

	}

}
