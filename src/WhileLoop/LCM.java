package WhileLoop;

import java.util.Scanner;

public class LCM {
	static void lcm(int n1, int n2) {
		int lcm;
		int max;
		
		if (n1 < n2) {
			max = n1;
		} else {
			max = n2;
		}
		
		while (true) {
			if (max % n1 == 0 & max % n2 == 0) {
				lcm = max;
				break;
			}
			max++;
		}
		System.out.println("LCM :" +lcm);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n1 = Sc.nextInt();
		System.out.println("Enter a number");
		int n2 = Sc.nextInt();
		lcm(n1, n2);

	}

}
