package langfunconstructor;

public class Bike1 {
	int milage;
	float cost;
	String name;
	Bike1() {
		milage = 40;
		cost = 10000.0f;
		name = "Bullet";
	}
	public Bike1(int milage,float cost){
		//this(34,34000.7f,"Bullet");
		this.milage=  milage;
		this.cost = cost;
	}
	public Bike1(int milage ,float cost,String name){
		this(milage,cost);
		
		//this.milage = milage;
		//this.cost = cost;
		this.name = name;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike1 b = new Bike1();
		b.display();
		System.out.println("------------------------");
		Bike1 b1 = new Bike1(30,1000000.0f);
		b1.display();
		System.out.println("-------------------------");
		
		Bike1 b2 = new Bike1(45,70000.0f,"Bullet");
		b2.display();
		System.out.println("-------------------------");
		
		
		
		

	}
	void display() {
		System.out.println("Milage:" + milage);
		System.out.println("Cost:" + cost);
		System.out.println("Name:" + name);
	}

}
