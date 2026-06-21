package Loops;

import java.util.Scanner;

public class Multiplaction {
	static void show(int n) {
		for(int i = 1; i<=n;i++) {
			System.out.println(n + " * " + i +" = "+ (n*i));
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = Sc.nextInt();
		
		show(a);

	}

}
