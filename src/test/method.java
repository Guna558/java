package test;


public class method{
	static void use() {
		System.out.println("class2");
	}
	void show() {
		use();
		System.out.println("class3");
	}

	public static void main(String[] args) {
		System.out.println("Class1");
		method p = new method();
		method t = new method();
		
	    p.show();
	    t.meta();
	

	}
	static void index() {
		System.out.println("class4");
	}
	void meta() {
		index();
		System.out.println("class8");
	}
	
	
	

}
