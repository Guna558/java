package langfunconstructor;

public class Superexample {
	
	Superexample(){
		super();
		System.out.println("no agrs1");
	}

	public static void main(String[] args) {
		System.out.println("main method1");
		//Superexample s = new Superexample();
		//example e = new example();
		example1 e1 = new example1();

	}

}

class example extends Superexample {
	example(){
		super();
		System.out.println("no args");
	}

	

	public static void main(String[] args) {
		System.out.println("main method");
		example e = new example();
		example1 e1 = new example1();


	}

}

class example1 extends Superexample {
	
	example1 (){
		super();
		System.out.println("no agrs2");
	}
	public static void main(String[] args) {
		System.out.println("main method2");
		//example1 e = new example1();

	}
}
