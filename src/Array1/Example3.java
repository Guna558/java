package Array1;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a size of an array");
		int size = Sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter a values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Sc.nextInt();
		}
		System.out.println("Array  even values is:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}

	}

}
