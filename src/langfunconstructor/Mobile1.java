package langfunconstructor;

public class Mobile1 {
	String brand;
	float price;
	String Color;
	Mobile1(){
		this("sams",120000.0f);
		
	}
	Mobile1(String brand,float price){
	 this.brand = brand;
	 this.price = price;
	}
	Mobile1(String brand,float price,String color){
		this(brand,price);
		this.Color = color;
		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile1 m = new Mobile1();
		m.show();
		
		
		Mobile1 m1 = new Mobile1("Oppo",5675.9f);
		m1.show();
		
		Mobile1 m2 = new Mobile1("Oppo",34455.9f,"black");
		m2.show();

	}
	void show() {
		System.out.println("brand:" +brand);
		System.out.println("price:" +price);
		System.out.println("color:" + Color);
	}

}
