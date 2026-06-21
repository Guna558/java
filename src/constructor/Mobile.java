package constructor;

public class Mobile {
	String brand;
	int ram;
	double cost;
	Mobile(String brand,int ram,double cost){
		this.brand = brand;
		this.ram = ram;
		this.cost = cost;
	}
	Mobile(Mobile m){
		this.brand =m. brand;
		this.ram = m.ram;
		this.cost = m.cost;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m1 = new Mobile("oppo",8,2000.0);
		
		Mobile m2 = new Mobile(m1);
		m1.display();
		m2.display();

	}
	void display() {
		System.out.println("brand:"  + brand);
		System.out.println("ram:"  + ram);
		System.out.println("cost:"  + cost);
	}

}
