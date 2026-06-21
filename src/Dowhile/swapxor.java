package Dowhile;

import java.util.Scanner;

public class swapxor {
	static void swap(int a,int b) {
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a");
		int a = Sc.nextInt();
		System.out.println("Enter b");
		int b = Sc.nextInt();
		
		swap(a,b);


	}

}
