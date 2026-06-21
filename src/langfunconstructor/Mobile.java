package langfunconstructor;

public class Mobile {
	double price;
	String name;
	String performance;
	Mobile(double price,String name,String Performance){
		this.price = price;
		this.name = name;
		this.performance = Performance;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m = new Mobile(30000.0,"oppo","good");
		display(m);

	}
	static void display(Mobile m) {
		System.out.println("Mobile Price:" +m. price);
		System.out.println("Mobile name :" + m.name);
		System.out.println("Mobile performance:" +m. performance);
	}

}
