package langfun;

import java.util.Scanner;

public class Attendence {
	 static Scanner Sc = new Scanner(System.in);
	  static int working() {
		 System.out.println("Enter the total Number of Working days");
		 int n1 = Sc.nextInt();
		 return n1;
	 }
	 
	  static int attendence() {
		 System.out.println("Enter the Attended days ");
		 int n2 = Sc.nextInt();
		 return n2;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Attendence a1 = new Attendence();
		int f1 = working();
		int f2= attendence();
		 System.out.println("Total attendence Percentage:" + ((f2*100) / f1));

	}

}
