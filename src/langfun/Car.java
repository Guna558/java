package langfun;

public class Car {
	void car( String brand,String color, int number) {
		System.out.println("Car brand:" +  brand);
		System.out.println("Car color:" + color);
		System.out.println("Car number" + number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj = new Car();
		obj.car("BENZ","BLUE",5265);

	}

}
