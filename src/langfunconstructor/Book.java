package langfunconstructor;

public class Book {
	String author;
	double price;
	String address;
	Book(){
		author = "Arnold";
		price = 459.9;
		address = "hyd";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book();
		System.out.println("Book Author:" + b.author);
		System.out.println("Book price:" + b.price);
		System.out.println("Address:" + b.address);

	}

}
