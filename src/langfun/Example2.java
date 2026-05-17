package langfun;

import java.util.Scanner;

public class Example2 {
	static void details(String name,long number) {
	System.out.println("Enter Name:" + name);
	System.out.println("Enter number:" + number);

	}
	static void bill (int qunatity,float price) {
		System.out.println("Enter quantity:"+ qunatity);
		System.out.println("Enter price:" + price);
		System.out.println("total bill:"+ (qunatity * price));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		details("guna",8885642508L);
		//details(8885642508L);
	
	
		bill(345,4556.7f);
	}

}
