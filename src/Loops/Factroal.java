package Loops;

import java.util.Scanner;

public class Factroal {
	static void display(int n) {
		for(int i = 1;i<=n;i++) {
			if(n%i==0){
				System.out.println(i);
				
			}
		}
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner Sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n = Sc.nextInt();
		
		display(n);

	}

}
