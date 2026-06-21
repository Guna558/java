package langfun;

import java.util.Scanner;

public class Methodoverloading {
	int display(int a,int b) {
		return(a+b);
	}
	double display(double a1,double b1) {
		return(a1+b1);
		
	}
	double show(double a2,double b2,double c) {
		return(a2+b2+c);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("ENter value");
		int a = Sc.nextInt();
		System.out.println("Enter value");
		int b = Sc.nextInt();
		System.out.println("Enter value");
		double a1 = Sc.nextDouble();
		System.out.println("Enter value");
		double b1 = Sc.nextDouble();
		System.out.println("Enter value");
		double a2 = Sc.nextDouble();
		System.out.println("Enter value");
		double b2 = Sc.nextDouble();
		System.out.println("Enter value");
		double c = Sc.nextDouble();
		
		Methodoverloading m = new Methodoverloading();
		m.display(a,b);
		m.display(a1, b1);
		m.show(a2, b2,c);
		System.out.println("Result:"+m.display(a,b));
		System.out.println("Result:" +m.display(a1, b1));
		System.out.println("Result:" + m.show(a2, b2,c));


	}

}
