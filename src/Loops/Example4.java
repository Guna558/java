package Loops;

import java.util.Scanner;
import java.math.BigDecimal;

public class Example4 {
	static void isfactorial(int n) {
		//int sum =0;
		BigDecimal num = new BigDecimal(1);
		for(int i =1;i<=n;i++) {
			num = num.multiply(BigDecimal.valueOf(i));
		}
		System.out.println("Factorial:" + num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in) ;
		System.out.println("Enter a number");
		int a = Sc.nextInt();
		isfactorial(a);
		
		
			
		

	}

}
