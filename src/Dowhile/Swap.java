package Dowhile;
import java.util.Scanner;
public class Swap {
	static void swap(int a,int b) {
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("a value is:" + a);
		System.out.println("b value is:" +b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a");
		int a = Sc.nextInt();
		System.out.println("Enter b");
		int b = Sc.nextInt();
		
		swap(a,b);

	}

}
