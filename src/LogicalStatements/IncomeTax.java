package LogicalStatements;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc  = new Scanner(System.in);
		System.out.println("Enter number");
		double num = Sc.nextDouble();
		double tax = 0;
		if(num<=2.5) {
			tax = 0;
		}else if(num<=5) {
			tax = num*0.05;
		}else if(num<=10) {
			tax = num*0.10;
		}else if(num <= 10){
			tax = num *0.20;
		}
		System.out.println(tax);

	}

}
