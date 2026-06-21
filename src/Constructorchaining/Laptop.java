package Constructorchaining;

public class Laptop {
	String brand;
	int ram;
	double price;
	Laptop(){
		this("Hp");
	}
	Laptop(String brand){
		this(brand,8);
	}
	Laptop(String brand,int ram){
		this(brand,ram,50000.0);
	}
	Laptop(String brand,int ram,double price){
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l =  new Laptop();
		l.display();
		Laptop l1 =  new Laptop("Dell",16);
		l1.display();
		Laptop l2 =  new Laptop("lenvo",32,100000.0);
		l2.display();

	}
	void display() {
		System.out.println("brand:" + brand);
		System.out.println("ram:" + ram);
		System.out.println("price:" + price);
	}

}
