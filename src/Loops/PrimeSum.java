package Loops;

import java.util.Scanner;

public class PrimeSum {
	static boolean isprime(int n) {
		boolean status = true;
		if(n<=1) {
			return false;
		}
		for(int i = 2;i<=n/2;i++) {
			if(n%i==0) {
			return  false;
		
			}
		}
		return status;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter start range");
		int n1 = Sc.nextInt();
		System.out.println("Enter end range");
		int n2 = Sc.nextInt();
		int sum =0;

		for (int i = n1; i <= n2; i++) {
			if(isprime(i)) {
				System.out.println(i);
				sum = sum +i;
				
			}
			
		}
		System.out.println("sum is:" + sum);


	}

}
