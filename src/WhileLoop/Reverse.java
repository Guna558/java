package WhileLoop;

import java.util.Scanner;

public class Reverse {
	static void isreverse(int n) {
		int rev = 0;
		int r =0;
		int  num=n;
		while(n>0) {
			r = n%10;
			rev = rev*10 +r;
			n = n/10;
			
			
		}
		if(num==rev) {
			System.out.println("palidrome");
		}else {
			System.out.println("not palidrome");
		}
		System.out.println("Reverse is:" + rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in );
		System.out.println("Enter a number");
		int n = Sc.nextInt();
		
		isreverse(n);

	}

}
