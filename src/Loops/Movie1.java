package Loops;

import java.util.Scanner;

public class Movie1 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = Sc.nextInt();

		int[] arr = new int[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			if(i%2==0) {
				arr[i]=1;
			}else {
				arr[i]=0;
				
			}

		}
		for(int i = 0;i<n;i++) {
			if(arr[i]==1){
				System.out.println("booked:" + i);
				
			}else {
				System.out.println("available:" + i);
				count++;
			}
		}
		System.out.println("Total seats:" + count);

	}

}
