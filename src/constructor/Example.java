package constructor;

public class Example {
	Example() {
		System.out.println("A");
	}

	public static void main(String[] args) {

	}

}

class ClassB1 extends Example {
	 int x;
	ClassB1(int x){
		super();
		this.x =x;
		System.out.println("B");
		
	}
	public static void main(String[] args) {
		ClassB1 b = new ClassB1(10);

	}

}

class Classc extends ClassB1 {
	Classc(){
		super(10);
		System.out.println("c");
		//Classc c = new Classc();
		
	}


//	public static void main(String[] args) {
	Classc c = new Classc();
//		
//
//	}

}