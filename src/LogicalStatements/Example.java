package LogicalStatements;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = Sc.nextInt();
		
		if(num>0){
			System.out.println("Postivie number");
			
		}else if (num < 0){
			System.out.println("negative number");
		}else{
			System.out.println("zero");
			
		}
		

	}

}
