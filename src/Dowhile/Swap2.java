package Dowhile;

import java.util.Scanner;

public class Swap2 {
	static void swap(int a ,int b) {
		b = a+b;
		a = b-a;
		b= b-a;
		System.out.println("A value:" + a);
		System.out.println("B value:" + b);

		
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
