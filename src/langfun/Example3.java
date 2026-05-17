package langfun;

import java.util.Scanner;

public class Example3 {

	static double area(double r) {
		return Math.PI*r*r;
	}
	static double volume(double rad) {
		return 1.3*Math.PI*rad*rad*rad;
	}
	static double perimeter(double radius) {
		return 2*Math.PI*radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter value of area");
		double area = Sc.nextDouble();
		area(area);
		System.out.println("Final result" + area(area));
		
		System.out.println("Enter value of volume");
		double n1 = Sc.nextDouble();
		volume(n1);
		System.out.println("Final result of volume" + volume(n1));
		
		System.out.println("Enter value of perimeter");
		double n2 = Sc.nextDouble();
		perimeter(n2);
		System.out.println("final result" + perimeter(n2));
		

	}

}
