package LogicalStatements;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter marks");
		int num = Sc.nextInt();
		
		if(num>=90) {
			System.out.println("A");
		}else if(num>=70) {
			System.out.println("B");
		}else if (num>=50) {
			System.out.println("c");
		}else if(num<50) {
			System.out.println("Fail");
		}

	}

}
