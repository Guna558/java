package LogicalStatements;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter 1 number");
		int a = Sc.nextInt();
		System.out.println("ENter 2 number");
		int b = Sc.nextInt();
		System.out.println("Emter 3 number");
		int c = Sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("Large:" + a);
			
		}else if(b>c && b>c) {
			System.out.println("large:" + b);
		}else {
			System.out.println("large:" + c);
		}

	}

}
