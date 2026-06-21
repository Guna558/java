package LogicalStatements;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in); 
		System.out.println("Enter age");
		int num = Sc.nextInt();
		
		if(num>=18) {
			System.out.println("Your eligible");
			if(num>=60) {
				System.out.println("Senior");
			}else {
				System.out.println("not eligible");
			}
		}

	}

}
