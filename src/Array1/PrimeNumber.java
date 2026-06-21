package Array1;

import java.util.Scanner;

public class PrimeNumber {
	
	static boolean isprime(int size) {
		boolean status = true;
		if(size<=1) {
			return false;
		}
		for(int i =2;i<size;i++) {
			if(size%i==0) {
				status = false;
			}
			
		}
		
		return status;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter size of an array ");
		int size = Sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter a number");
		
		
		for(int i =0;i<arr.length;i++) {
			arr[i] = Sc.nextInt();
		}
		System.out.println("Prime number");
		for(int i = 0;i<arr.length;i++) {
			if(isprime(arr[i])) {
				System.out.println(arr[i]);
				
			}
		}
		
		

	}

}
