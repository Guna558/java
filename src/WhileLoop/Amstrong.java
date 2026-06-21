package WhileLoop;

import java.util.Scanner;

public class Amstrong {
	static boolean isamstrong(int n) {
		//boolean status = false;
		int r =0;
		int sum =0;
		int temp =n;
		int count =0;
		
		while(temp>0) {
			r = temp%10;
			temp = temp/10;
			count++;
			
			
			
		}
		while(temp>0) {
			r = temp%10;
			temp = temp/10;
			sum = (int) (sum+Math.pow(r, count));
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
		boolean status=isamstrong(n);
		
		if(status) {
			System.out.println("Amstrong number");
		}else {
			System.out.println("Not amstrong number");
		}

	}

}
