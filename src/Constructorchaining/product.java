package Constructorchaining;

public class product {
	int id;
	String name;
	int quantiy;
	double price;
	
	product(int id){
		this(id, "name");
	}
	product(int id,String name){
		this(id,"name",id);
		
	}
	product(int id,String name,int quantity){
		this(id,"name",id,0.0);
	}
	product(int id,String name,int quantity,double price){
		this.id = id;
		this.name = name;
		this.quantiy = quantity;
		this.price = price;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product p = new product(101,"Guna",1,100.0);
		p.show();
	}
	void show() {
		System.out.println("ID:" +  id);
		System.out.println("Name:" + name);
		System.out.println("Quantity:" + quantiy);
		System.out.println("Price:" + price);
	}

}
