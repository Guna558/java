package lang;

public class sample2 {
	static {
		System.out.println("static method");
		sample2 t = new sample2();
		sample2 g = new sample2();
		t.method();
		t.method2();

	}

	void method() {
		System.out.println("instance method");
	}

	void method2() {
		System.out.println("instance method 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// display();

	}

}
