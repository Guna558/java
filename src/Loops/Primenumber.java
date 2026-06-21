package Loops;

import java.util.Scanner;

public class Primenumber {
	static boolean isprime(int n) {
		boolean status = true;
		
		if(n<=1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
			 status =  false;
				break;
			}
			
		}
		return true;
	}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in) ;
		System.out.println("Enter number");
		int n = Sc.nextInt();
		
		boolean status = isprime(n);
		for(int i=2;i<=n;i++) {
			if(isprime(i)) {
				System.out.println(i);
			}
		}
		if(status) {
			System.out.println("Prime number");
			
		}else {
			System.out.println("Not prime number");
		}
			
		

	}

}
