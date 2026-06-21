package WhileLoop;

import java.util.Scanner;

public class Neon {
	static void neon(int n) {
		int r = 0;
		int sum = 0;
		int square = n*n;
		int temp = n;
		while(square>0) {
			r = square%10;
			square = square/10;
			sum = sum + r;
			
			
		}if(sum  == temp) {
			System.out.println("Neon number");
		}else {
			System.out.println("Not neon number");
		}
		System.out.println("Sum:" +sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = Sc.nextInt();
		neon(n);

	}

}
