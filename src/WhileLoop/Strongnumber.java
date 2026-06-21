package WhileLoop;

import java.util.Scanner;

public class Strongnumber {
	static boolean strong(int n) {
		int r = 0;
		int temp = n;
		int sum = 0;
		while(temp>0) {
			r = temp%10;
			
			
			
			int fact = 1;
			for(int i = 1;i<=r;i++) {
				
				fact = fact *i;
				
				
			}
			System.out.println(fact);
			sum = sum + fact;
			
			temp = temp/10;
					
				
			}
			if(sum == n) {
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
		boolean status = strong(n);
		if(status) {
			System.out.println("Strong number");
		}else {
			System.out.println("not strong number");
		}

	}

}
