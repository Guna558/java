package constructor;

public class Copy {
	int id;
	String name;
	double price;

	Copy(int id) {
		this.id = id;

	}

//	Copy(Copy c){
//		this.id = c.id;
//		this.name = c.name;
//		
//	}
	Copy(Copy o) {
		this.id = o.id;
		this.name = o.name;
		this.price = o.price;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copy c = new Copy(100);
		c.name = "guna";
		c.price = 2000.0;
		
		Copy o = new Copy(c);
		System.out.println("origanl");
		c.display();
		System.out.println("copy");
		c.display();
		

	}
	void display() {
		System.out.println("Id:" + id);
		System.out.println("name:" + name);
		System.out.println("price:" + price);
	}

}
