package langfun;

import java.util.Scanner;

public class ABCSchool {
	

	static double subjects (double Mathematics,double science,double english ,double social ,double telugu) {
		double a = Mathematics+science+english+social+telugu;
		System.out.println("total subject:" + a);
		return a;
	} 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Mathematics Marks ");
		double Mathematics = Sc.nextDouble();
		//double n1 = subjects (Mathematics);
		System.out.println("Enter science Marks ");
		double science = Sc.nextDouble();
		System.out.println("Enter english Marks ");
		double english = Sc.nextDouble();
		System.out.println("Enter social Marks ");
		double social = Sc.nextDouble();
		System.out.println("Enter telugu Marks ");
		double telugu = Sc.nextDouble();
		double n1 = subjects(Mathematics,science,english,social,telugu);
		double b = (n1*100)/500;
		System.out.println("Total percentage:" + b);

	}

	
}
