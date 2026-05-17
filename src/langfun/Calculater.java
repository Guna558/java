package langfun;

import java.util.Scanner;

public class Calculater {
	static void display(int a, int b, int c) {
		System.out.println("Sub 1:" + a);
		System.out.println("Sub 2:" + b);
		System.out.println("Sub 3:" + c);
	}

	static void display1(int a, float f, short s) {
		float sum = a + f + s;
		System.out.println("Sub 1:" + a);
		System.out.println("Sub 2:" + f);
		System.out.println("sub 3:" + s);
		System.out.println("Total Marks:" + sum);
	}

	static void display(int a, int b, float d) {
		float average = (a * b * d);
		System.out.println("Sub 1:" + a);
		System.out.println("Sub 2:" + d);
		System.out.println("sub 3:" + b);
		System.out.println("Average Marks:" + average);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Display marks");
		int n1 = Sc.nextInt();
		int n2 = Sc.nextInt();
		int n3 = Sc.nextInt();
		display(n1, n2, n3);
		System.out.println("Total marks");
		int n4 = Sc.nextInt();
		float n5 = Sc.nextFloat();
		short n6 = Sc.nextShort();
		display1(n4, n5, n6);
		int n7 = Sc.nextInt();
		int n8 = Sc.nextInt();
		float n9 = Sc.nextFloat();
		display(n7, n8, n9);

	}

}
