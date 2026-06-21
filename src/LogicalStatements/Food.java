package LogicalStatements;

import java.util.Scanner;

public class Food {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice = Sc.nextInt();
		System.out.println("Enter quantity");
		int quantity = Sc.nextInt();
		int price = 0;
		
		switch(choice) {
		case 1:
			System.out.println("Pizza");
			
			price = 250;
			System.out.println("Price:" + price);
			break;
		case 2:
			System.out.println("Burger");
			price = 120;
			System.out.println("Price:" + price);
			break;
		case 3:
			System.out.println("Sandwich");
			price = 100;
			System.out.println("Price:" + price);
			break;
		case 4:
			System.out.println("cofee");
			price = 80;
			System.out.println("Price:" + price);
			break;
		default:
			System.out.println("invalid");
				
		}
		int totalbill = price * quantity;
		System.out.println("TotalBill:" + totalbill);

	}

}
