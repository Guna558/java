package WhileLoop;

import java.util.Scanner;

public class Digitcount {
	static void digitcount(int n,int d) {
		int r = 0;
		int count = 0;
		int temp = n;
		
		
		while(temp>0) {
			r = temp%10;
			
			if(r==d) {
				count++;
			}
			temp = temp/10; 
		}
		System.out.println("count:" + count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = Sc .nextInt();
		System.out.println("Enter a digit");
		int d = Sc.nextInt();
		digitcount(n,d);

	}

}
