package langfunconstructor;

public class Shopping {
	float price;
	int product;
	Shopping(){
		price = 4000.5f;
		product = 5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shopping s = new Shopping();
		s.display();
		

	}
	void display() {
		System.out.println("price:" + price);
		System.out.println("product:" + product);
	}

}
