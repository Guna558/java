package constructor;

public class Item {
	static int count = 0;
	int id;
	String name;
	Item(int id,String name){
		this.id =id;
		this.name = name;
		count++;
	}
	Item(Item i){
		this.id = i.id;
		this.name = i.name;
		count++;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item t = new Item(101,"Guna");
		t.display();
		Item t1 = new Item(t);
		t1.display();
		System.out.println(Item.count);
		
		

	}
	void display() {
		System.out.println("ID:" + id) ;
		System.out.println("Name:" + name);
	}

}
