package langfun;
import java.util.Scanner;

public class Method2 {
	static void addtion(int a,int b) {
		System.out.println(a+b);
	}
	static void addtion(int a,float b, double d,String s,char c,byte t,boolean o) {
		System.out.println(a+b+c+d+b+t);
		System.out.println(s);
		System.out.println(o);
		
	}
	static void division(int a,byte d) {
		System.out.println("Result:" + a/d);
		

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addtion(10,20);
		addtion(10,79.0f,757969.097,"guna",'g',(byte) 5,false);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("Enter a number");
		byte  d = sc.nextByte();
		division( a,d);
		 sc.close();
		
	}

}
