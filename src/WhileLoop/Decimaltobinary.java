package WhileLoop;

import java.util.Scanner;

public class Decimaltobinary {
	static void decimal(int n){
		int r = 0;
		
		String c =" ";
		
		while(n>0) {
			r = n%2;
			c = r+c;
			n = n/2;
		}
		System.out.println(c);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number;");
		int n = Sc.nextInt();
		
		decimal(n);

	}

}
