package LogicalStatements;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = Sc.nextInt();
		
		if(num%5==0) {
			System.out.println("Divisible by 5");
			
		}else {
			System.out.println("Not divible by 5");
		}

	}

}
