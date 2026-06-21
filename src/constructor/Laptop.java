package constructor;

 class Laptop1 {

	Laptop1(){
		System.out.println("laptop");
		//Bike b = new Bike();
	}
	Bike b = new Bike();
}
class mobile extends Laptop1{
	mobile(){
		System.out.println("mobile");
		
	}
}
class Bike extends mobile{
	Bike(){
		System.out.println("bike");
	}
}
public class Laptop{
	public static void main(String[] args) {
		 
		mobile m =  new mobile(); 

	}

	
}

