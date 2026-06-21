package langfunconstructor;

public class Car {
	String brand;
	float price;

	Car() {

		brand = "Benz";
		price = 78900.8f;
		display();
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		// c.display();

	}


	 void display (){
		System.out.println("Car Name:" + brand);
		System.out.println("Car Price:" + price);
	}

}
