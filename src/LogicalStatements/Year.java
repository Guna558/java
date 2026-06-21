package LogicalStatements;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter year");
		int num = Sc.nextInt();
		
		if(num %400 == 0 ||  num % 4==0 && num !=100){
			System.out.println("Leaf year");
			
		}else {
			System.out.println("Not leaf year");
		}

	}

}
