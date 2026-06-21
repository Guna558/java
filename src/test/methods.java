package test;

public class methods {
	int a = 20;
	String b = "guna";

//	static void display() {
//		System.out.println("satic method");
//	}

	void green() {
		System.out.println("instance method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
		methods t = new methods();
		t.green();
		//display();
		System.out.println(t.a);
		System.out.println(t.b);

	}

}
