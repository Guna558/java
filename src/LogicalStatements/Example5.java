package LogicalStatements;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter  1 number");
		int a = Sc.nextInt();
		System.out.println("Entre 2 number");
		int b = Sc.nextInt();
		System.out.println("Enteer 3 number");
		int c = Sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("largest nuber:" + a);
		}else if(b>a&&b>c) {
			System.out.println("largest number:" + b);
		}else {
			System.out.println("largest number:" + c);
		}
		

	}

}
