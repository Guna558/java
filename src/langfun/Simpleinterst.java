package langfun;

import java.util.Scanner;

public class Simpleinterst {
	static double show(int p,double time,double rate) {
		return (p*time*rate)/100;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("ENter principle value");
		int p = Sc.nextInt();
		System.out.println("ENter rate value");
		double r = Sc.nextDouble();
		System.out.println("Enter time ");
		double t = Sc.nextDouble();
		
		show(p,r,t);
		System.out.println("Simple interst:" + show(p,r,t));
		

	}

}
