package LogicalStatements;

import java.util.Scanner;

public class Evenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int a = Sc.nextInt();
		
		if(a%2 == 0){
			System.out.println("even number");
		}else {
			System.out.println("odd number");
		}

	}

}
