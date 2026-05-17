package langfun;
import java.math.BigInteger;
import java.math.BigDecimal;


public class Operation1 {
	int a;
	int b;
	float f;
	double d;
	byte e;
	BigInteger x;
	BigDecimal z;

	void addtion() {
		a = 20;
		b = 30;
		f = 679.9f;
		d = 768709.98;
		x = new BigInteger("76987609890");
		z = new BigDecimal("760976090.98");
		e = 62;
		System.out.println("addtion:" + (a + b));
		System.out.println("subtraction:" + (d-e));
		System.out.println("multiplication:" + (b*e));
		System.out.println("Division:" + (f/a));
		//System.out.println("Division:" + (x/y));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation1 t = new Operation1();
		t.addtion();

	}

}
