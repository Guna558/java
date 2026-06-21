package Loops;

import java.util.Scanner;

public class RecursionEvenodd {
	static boolean isrecursion(int n) {
		if(n==0) {
			return true;
		}if(n==1){
			return false;
			
			
			
		}
		return isrecursion(n-2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = Sc.nextInt();
		

		
		boolean status = isrecursion(n);
		if(status) {
			System.out.println("Even number");
		}else {
			System.out.println("odd number");
		}

	}

}
