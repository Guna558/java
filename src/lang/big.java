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

        big c = new big();
        c.display();

        System.out.println("Object reference: " + c);

        System.out.println("BigInteger value: " + c.b);
        System.out.println("BigDecimal value: " + c.d);

        System.out.println("BigInteger Addition: " + c.b.add(c.b));
        System.out.println("BigDecimal Addition: " + c.d.add(c.d));

        System.out.println("BigInteger Subtraction: " + c.b.subtract(c.b));
        System.out.println("BigDecimal Subtraction: " + c.d.subtract(c.d));

        System.out.println("BigInteger Multiplication: " + c.b.multiply(c.b));
        System.out.println("BigDecimal Multiplication: " + c.d.multiply(c.d));

        System.out.println("BigInteger Division: " + c.b.divide(c.b));
        System.out.println("BigInteger Modulus: " + c.b.mod(c.b));
    }
}