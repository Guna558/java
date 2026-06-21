package Loops;

import java.util.Scanner;

public class Example2 {
	static void show(int n) {
		int evensum = 0;
		int oddsum = 0;
		for(int i=1;i<=n;i++) {
			if(i % 2 ==0) {
				evensum = evensum +i;
				//System.out.println("Even number");
				
				//System.out.println( evensum);
				}else {
					oddsum = oddsum + i;
					//System.out.println("odd number");
					//System.out.println(  oddsum);

				}
			
			
				
			}
		System.out.println("sum of Even number:"  + evensum);
		System.out.println("sum of odd number:"  + oddsum);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = Sc.nextInt();
		show(n);
		
		
		

	}

}
