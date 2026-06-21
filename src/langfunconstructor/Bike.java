package langfunconstructor;
import java.util.Scanner;

public class Bike {
	float price;
	String name;
	int distance;
	Bike(float price,String name,int distance){
		this.price = price;
		this.name = name;
		this.distance = distance;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter price");
		float n1 = Sc.nextFloat();
		
		System.out.println("Enter name");
		Sc.nextLine();
		String n2 = Sc.nextLine();
		
		System.out.println("Enter distance");
		int n3 = Sc.nextInt();
		
		Bike b = new Bike(n1,n2,n3);
		b.display();
		
		

	}
	void display() {
		System.out.println("price:" + price);
		System.out.println("name:" + name);
		System.out.println("Distance:" + distance);
	}

}
