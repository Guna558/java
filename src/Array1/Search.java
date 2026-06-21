package Array1;

import java.util.Scanner;

public class Search {
	static boolean search(int n) {
		boolean status = true;
		
		int[] arr = {10,20,30,40};
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==n) {
				return true;
			}
			}
		return status;
			
		}
		
		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = Sc.nextInt();
		boolean status = search(n);
		
		if(status) {
			System.out.println("Element found");
		}else {
			System.out.println("Not found");
		}
		
	}

}
