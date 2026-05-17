package langfun;
import java.util.Scanner;

public class Shopping {
	static Scanner Sc = new Scanner(System.in);
	  static int product() {
		 System.out.println("Enter First Product");
	     int n1 = Sc.nextInt();
		 System.out.println("Enter Second Product");
		 int n2 = Sc.nextInt();
		 System.out.println("Enter Third Product");
		 int n3 = Sc.nextInt();
		 int sum = n1+n2+n3;
		 return sum;
	 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//product();
		int totalbill = product();
		
		System.out.println("total Bill:" + totalbill );
		
		

	}

}
