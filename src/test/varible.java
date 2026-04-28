package test;

public class varible {
	static void greek() {
		System.out.println("satic variable");

	}

	void display() {
		System.out.println("instance method");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greek();
		varible t = new varible();
		t.display();
				

	}

}
