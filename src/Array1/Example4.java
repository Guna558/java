package Array1;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = Sc.nextInt();
		String[] size1 = new String[size];
		
		System.out.println("Enter names");
		for(int i = 0; i<size1.length;i++) {
			size1[i] = Sc.next();
		}
		System.out.println("The letter starts with G:");
		for(int i = 0;i<size1.length;i++) {
			if(size1[i].startsWith("G")) {
				System.out.println(size1[i]);
			}
		}
		
		

	}

}
