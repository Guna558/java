package Loops;

import java.util.Scanner;

public class Prime2 {
	static boolean isprime(int n) {
		boolean status = true;
		if(n ==0 ||n==1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				status = false;
			}
		}
		return status;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number prime or not");
		int n = Sc.nextInt();
		boolean status = isprime(n);
		
		
		if(status) {
			System.out.println("Prime number");
		}else {
			System.out.println("Not prime number");
		}

	}

}
