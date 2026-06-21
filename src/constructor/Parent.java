package constructor;

public class Parent {
	int age;
	Parent(){
		
	}
	Parent(int age){
		
	System.out.println("Parent age:" +  age);
	}

	 

	public static void main(String[] args) {
		System.out.println("main method1");
		Parent p = new Parent(  );
		

	}

}

class child extends Parent {
	child(){
		super(25);
		System.out.println("no args");
		
	}
	public static void main(String[] args) {
		System.out.println("main method");
		child c = new child();

	}

}
