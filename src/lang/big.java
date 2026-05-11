package lang;

import java.math.BigInteger;
import java.math.BigDecimal;

public class big {
	BigInteger b;
	BigDecimal d;

	void display() {
		b = new BigInteger("646745865757587");
		d = new BigDecimal("75897580759.08");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		big c = new big();
		{
			c.display();
			System.out.println(c);
			System.out.println(c.b);
			System.out.println(c.b.add(c.b));
			System.out.println(c.d.add(c.d));
			System.out.println(c.b.subtract(c.b));
			System.out.println(c.d.subtract(c.d));
			System.out.println(c.b.multiply(c.b));
			System.out.println(c.b.multiply(c.b));
			System.out.println(c.b.divide(c.b));
			System.out.println(c.b.mod(c.b));

		}

	}

}
