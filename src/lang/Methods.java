package lang;

public class Methods {
	static  void display1(){
		System.out.println("static method");
		
	}
	void display() {
		System.out.println("instance method");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
		Methods m = new Methods();
		m.display();
		Methods.display1();

	}

}
