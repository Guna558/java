package langfun;


public class Abstact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee1 e = new employee1();
		e.a = 20;
		e.name = "guna";
		employee(e);
		

	}
	static void employee(employee1 e) {
		System.out.println(e.a);
		System.out.println(e.name);
	}

}
