package WhileLoop;

import java.util.Scanner;

public class Amstrong1 {
	private static final int i = 0;

	static boolean isamstrong(int n) {
		int r =0;
		int sum =0;
		int count = 0;
		int temp = n;
		
		while(temp>0) {
			r = temp%10;
			temp = temp/10;
			count++;
			
		}
		while(temp>0) {
			r = temp%10;
			temp = temp/10;
			int power = 1;
			
			for(int i = 0;i<=count;i++) {
				power = power*r;
				
			}
			sum = sum + power;
		}
		if(sum == temp) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = Sc.nextInt();
		boolean status = isamstrong(n);
		if(status) {
			System.out.println("Amstrong number");
		}else {
			System.out.println("not amstrong number");
		}

	}

}
