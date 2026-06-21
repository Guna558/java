package WhileLoop;

import java.util.Scanner;

public class chocolates {
	static void chocolates(int n,int n1) {
		int money = n;
		int cost = n1;
		
		int chocolates = money/cost;
		int wrappers = chocolates;
		int total = chocolates;
		
		while(wrappers>=3) {
			int free = wrappers/3;
			total = total+free;
			
			wrappers = (wrappers%3)+free;
			
			
		}
		System.out.println("Total:" + total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter money");
		int n = Sc.nextInt();
		System.out.println("Enter cost");
		int n1 = Sc.nextInt();
		chocolates(n,n1);

	}

}
