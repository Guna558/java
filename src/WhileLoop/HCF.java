package WhileLoop;

import java.util.Scanner;

public class HCF {
	static void hcf(int n1, int n2) {
		int hcf = 1;
		int max = 1;

		while (max <= n1 && max <= n2) {
			if (n1 % max == 0 && n2 % max == 0) {
				hcf = max;
				
			}
			max++;

		}
		System.out.println("HCF:" + hcf);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n1 = Sc.nextInt();
		System.out.println("Enter a number");
		int n2 = Sc.nextInt();
		hcf(n1, n2);

	}

}
