package LogicalStatements;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = Sc.nextInt();
		
		if(age>=18) {
			System.out.println("Your eliglible");
		}else{
			System.out.println("not eliglibe");
			
		}

	}

}
