package langfunconstructor;

public class Book1 {
	String title;
	float price;
	String author;
	Book1(){
		this("java",300.0f);
	}
	Book1(String title,float price){
		this.title = title;
		this.price = price;
		
	}
	Book1(String title,float price,String author){
		this(title,price);
		this.author = author;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Book1 b = new Book1();
		b.show();
		Book1 b1 = new Book1("html",2350.0f);
		b1.show();
		Book1 b2 = new Book1("css",350.9f,"babu");
		b2.show();	

		

	}
	void show() {
		System.out.println("title:" + title);
		System.out.println("---------------");
		System.out.println("price:" + price);
		System.out.println("--------------");
		System.out.println("author:" + author);
	}

}
