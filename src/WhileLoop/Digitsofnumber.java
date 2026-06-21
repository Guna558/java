package WhileLoop;

import java.util.Scanner;

public class Digitsofnumber {
	static void isdigit(int n) {
		int count = 0;
		int r = 0;
		
		while(n>0) {
			r = n%10;
			n = n/10;
			count++;
			
			
		}
		System.out.println("Digit count is :" + count);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = Sc.nextInt();
		
		isdigit(n);

	}

}
