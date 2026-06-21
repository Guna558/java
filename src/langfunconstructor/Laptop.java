package langfunconstructor;

public class Laptop {
	String brand;
	double price;

	Laptop(String brand, double price) {
		this.brand = brand;
		this.price = price;

	}

	Laptop() {
		brand = "Dell";
		price = 567890;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l = new Laptop("Hp", 60000);
		l.show();

		Laptop l1 = new Laptop();
		l1.show();

	}

	void show() {
		System.out.println("brand:" + brand);
		System.out.println("price:" + price);
	}

}
