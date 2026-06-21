package Loops;

import java.math.BigInteger;
import java.util.Scanner;

public class Facorial {
	static void display(int n) {
		BigInteger fact=new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			 fact = fact.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println(fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=Sc.nextInt();
		display(n);
	}

}
