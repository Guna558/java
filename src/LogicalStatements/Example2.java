package LogicalStatements;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter number");
		int a = Sc.nextInt();
		System.out.println("Enter number");
		int b = Sc.nextInt();
		if(b>a) {
			System.out.println("largest number:" +b);
		}else if(a<b){
			System.out.println("smallest nuber:" + a);
		}else {
			System.out.println("both or equal");
		}
		

	}

}
