package langfun;

import java.util.Scanner;

public class Areaoperation {
	//private static double r;

	static double square(double side) {
		return side * side;
	}

	static float rectangle(float length, float breadth) {
		return length * breadth;
	}

	static int triangle(int base, int height) {
		return base * height;
	}

	static double circle(double r) {
		return Math.PI * r * r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter side:");
		double square = Sc.nextDouble();
		square(square);
		System.out.println("Area of squares:" + square(square));
		System.out.println("Enter length");
		float length = Sc.nextFloat();
		System.out.println("Enter breadth");
		float breadth = Sc.nextFloat();
		rectangle(length, breadth);
		System.out.println("Area of rectangle:" + rectangle(length, breadth));
		System.out.println("Enter base");
		int base = Sc.nextInt();
		System.out.println("Enter height");
		int height = Sc.nextInt();
		triangle(base, height);
		System.out.println("Area of trianle:" + triangle(base,height));
		System.out.println("Enter radius");
		double circle = Sc.nextDouble();
		circle(circle);
		System.out.println("Area of circle:" + circle(circle));
	}

}
