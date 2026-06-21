package Loops;

import java.util.Scanner;

public class Recursion {
	static int isrecursion(int n) {
		if(n==0||n==1) {
			return 1;
			
		}
		return n*isrecursion(n-1);
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in) ;
		System.out.println("Enter a  number");
		int n= Sc.nextInt();
		
		
			System.out.println("Factrioal:" +isrecursion(n));
		

	}

	
}
