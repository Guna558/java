package Loops;

import java.util.Scanner;

public class Movie {
	static boolean ismovie(int n) {
		boolean status = true;
		int count =0;
		for (int i = 1; i <= n; i++) {
			if(n%i==0) {
				count++;
			}
			

		}
		if(n == 2) {
			return status;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = Sc.nextInt();
		
		boolean status = ismovie(n);
		for(int i =0;i<=100;i++) {
			System.out.println(i);
		}
		if(status) {
			System.out.println("booked");
		}
		System.out.println("Available");
		

	}

}
