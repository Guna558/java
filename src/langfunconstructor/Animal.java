package langfunconstructor;

public class Animal {
	Animal(){
		System.out.println("Animal created");
		
	}

	public static void main(String[] args) {

	}

}

class Dog extends Animal {
	Dog(){
		super();
		System.out.println("Dog created");
	}
	
	public static void main(String[] args) {
		Dog d  = new Dog();

	}

}
