package test;

public class block {
	static {
		System.out.println("static method");
	}
	{
		System.out.println("instance method");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		block t = new block();
		
	
		
	}
	
	
	
	

}
