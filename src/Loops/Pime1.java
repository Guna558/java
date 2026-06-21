package Loops;

import java.util.Scanner;

public class Pime1 {
	static boolean isprime(int n) {
		boolean status = true;
		if(n<=1) {
			return false;
		}
		for(int i = 2; i<=n/2;i++) {
			if(n%i==0) {
				status = false;
				break;
			}
		}
		return status;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = Sc.nextInt();
		int count = 0;
		System.out.println("alter number");
		for(int i = 2;i<=n;i++) {
			if(isprime(i)) {
				count++;
			}
			if(count%2!=0) {
				System.out.println(i);
				
			}
		}

	}

}
