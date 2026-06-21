package LogicalStatements;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = Sc.nextInt();
		
		if(num == 0) {
			System.out.println("0 number");
		}else if(num %2 == 0) {
			System.out.println("even number");
		}else {
			System.out.println("odd");
		}

	}

}
