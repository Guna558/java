package langfunconstructor;

public class RestauranentBill {
	String name;
	String foodname;
	int quantity;
	float price;
	RestauranentBill(String name,String foodname,int quantity,float price){
		this.name = name;
		this.foodname = foodname;
		this.quantity = quantity;
		this.price = price;
		
	}

	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestauranentBill r = new RestauranentBill("Guna","chicken",10,450.8f);
		
		RestauranentBill r1 = new RestauranentBill("sekhar","mutton",15,50.6f);
		
		RestauranentBill r2 = new RestauranentBill("Reddy","fish",12,34.6f);
		
		r.show();
		r1.show();
		r2.show();
		
		

	}
	void show() {
		price = price * quantity;
		System.out.println("Customer Name:" + name);
		System.out.println("Fooditem:" + foodname);
		System.out.println("Quantity:" + quantity);
		System.out.println("Price:" + price);
		System.out.println("Total :" + price);
	}

}
