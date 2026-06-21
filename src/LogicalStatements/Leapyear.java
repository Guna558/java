package LogicalStatements;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter year");
		int num = Sc.nextInt();
		
		if(num%4==0&& num !=0||num%400==0) {
			System.out.println("leap year");
		}else {
			System.out.println("not leap year");
		}

	}

}
