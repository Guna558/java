package langfun;

import java.util.Scanner;

public class Calculatest {
	static double principle (double principle) {
		return principle; 
	}
	static float time (float time) {
		return time;
	}
	static int rate (int rate) {
		return rate;
	}
	static double getptr( double p,float t, int r) {
	
		return p * t * r / 100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter principle value");
		double principle = Sc.nextDouble();
		double n1 = principle(principle);
		//System.out.println("result:" + n1);
		System.out.println("Enter time value");
		float time =  Sc.nextFloat();
		float n2 = time(time);
		//System.out.println("result:" + n2);
		System.out.println("Enter rate value");
		int rate = Sc.nextInt();
		int n3 = rate(rate);
		//System.out.println("result:" + n3);
		double n4 = getptr(n1,n2,n3);
		System.out.println("Simple interst:" + n4);
		

	}

}
