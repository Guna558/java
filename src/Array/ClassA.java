package Array;

public class ClassA {
	ClassA(){
		super();
		System.out.println("A");
		
	}

	public static void main(String[] args) {
		
	}

}
class ClassB extends ClassA {
	ClassB(){
		super();
		System.out.println("B");
		
	}

	public static void main(String[] args) {
		
	}

}
class Classc extends ClassB {
	Classc(){
		super();
		System.out.println("C");
		
	}

	public static void main(String[] args) {
		Classc c = new Classc();
		

	}

}