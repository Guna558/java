package langfunconstructor;

public class Car1 {
	String brand;
	long price;
	String model ;
	int milage;
	
	Car1(){
		this("BMW",500000000l);
	}
	Car1(String brand,long price,int milage){
		this(brand,price);
		this.milage = milage;
		
	}
	Car1(String brand,long price,int milage,String model){
		this(brand,price,milage);
		this.model = model;
	}
	Car1(String brand,long price){
		this.brand = brand;
		this.price = price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1  c = new Car1();
		c.show();
		
		Car1 c1 = new Car1("Benz",4567899l);
		c1.show();
		Car1 c2 = new Car1("tuffon",345670099l,45);
		c2.show();
		Car1 c3 = new Car1("innova",34400000l,35,"old");
        c3.show();
	}
	void show() {
		System.out.println("brand:" + brand);
		System.out.println("price:" + price);
		System.out.println("model:" + model);
		System.out.println("milage:" + milage);
	}

}
