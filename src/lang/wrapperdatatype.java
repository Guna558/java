package lang;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Scanner;
public class wrapperdatatype {
	Integer i;
	String s;
	BigInteger b;
	BigDecimal d;
	Double e;
	void display() {
		i = 10;
		s = "guna";
		e = 656759658.8;
		BigInteger b = new BigInteger("44445554645");
		BigDecimal d = new BigDecimal("44446554433.0");
		Scanner sc = new Scanner(System.in);
		System.out.println("BigInteger :" + b);
		System.out.println("BigDecimal :" + d);
		
	
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wrapperdatatype w = new wrapperdatatype();
		w.display();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter i value");
		int i = sc.nextInt();
		System.out.println("i :" + i);
		
		sc.close();
		
		

	}

}
