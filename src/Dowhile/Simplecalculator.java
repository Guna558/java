package Dowhile;

import java.util.Scanner;

public class Simplecalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		String s1 ;
		do {
		System.out.println("Enter a number");
		int n = Sc.nextInt();
		System.out.println("Enter a number");
		int n1 = Sc.nextInt();
		
		System.out.println("Enter a symbol");
		String symbol = Sc.next();
		switch(symbol) {
		case "+" -> System.out.println((n+n1));
		case "-" -> System.out.println((n-n1));
		case "*" -> System.out.println((n*n1));
		case "/" -> System.out.println((n/n1));
		case "%" -> System.out.println((n%n1));
		case "default" -> System.out.println("Invalid");
		}
		System.out.println("If you want to contiune yes ");
		s1 = Sc.next();
		
	}while(s1.equalsIgnoreCase("yes"));
		System.out.println("Exit");
	}	

}
