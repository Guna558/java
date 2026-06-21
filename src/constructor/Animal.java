package constructor;

public class Animal {
	String name;
	Animal(){
		name ="Dog";
		System.out.println("dog");
	}

	public static void main(String[] args) {
	

	}

}

class Dog extends Animal {
	String breed;
	Dog(){
		super();
		breed = "Animal";
		System.out.println("Animal");
		
	}
	public static void main(String[] args) {
		

	}

}

class puppy extends Dog {
	int age;
	puppy(){
		super();
		age = 10;
		System.out.println(age);
		
	}
	public static void main(String[] args) {
		puppy p = new puppy();
		
	}
}
