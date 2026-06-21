package constructor;

public class Product {
	int id;
	String name;
	double price;
	String brand;
	Product(int id,String name,double price,String brand){
		this.id =id;
		this.name = name;
		this.price = price;
		this.brand = brand;
		
	}
	Product(Product p){
		this.id =p.id;
		this.name = p.name;
		this.price =p. price;
		this.brand =p. brand;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p1 = new Product(101,"mobile",15000.0,"oopo");
		p1.display();
		System.out.println("---------------------------------------");
		Product p2 = new Product(p1);
		p2.display();
		

	}
	
	void display() {
		System.out.println("id:" + id);
		System.out.println("name:" + id);
		System.out.println("price:" + id);
		System.out.println("brand:" + id);
	}

}
