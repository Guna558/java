package test;

public class garbagecollector {
	public void finalize() {
		System.out.println("class 1");
	}
	static void method() {
		System.out.println("class 2");
	}
	void display(){
		System.out.println("class3");
		
	}

	public static void main(String[] args) {
		System.out.println("main method");
		garbagecollector t = new garbagecollector();
		t.display();
		garbagecollector.method();
		
	    t=null;
	    System.gc();

	}

}
