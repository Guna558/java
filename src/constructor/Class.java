package constructor;

public class Class{
	int x;
	Class (){
		System.out.println("A");
		
	}
	Class (int x){
		this.x=x;
		System.out.println("x:" + x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c = new Class();
		Class c1 = new Class(40);
		//System.out.println("b");
		

	}

}
class Classb extends Class {
	
	Classb(){
		super();
		System.out.println("B");
	}
	Classb(int x){
		super(20);
		System.out.println("c");
		
	}
	public static void main(String[] args) {
		Classb b =  new Classb();
		Classb b1 = new Classb(20);
		//System.out.println("a");
		
		
		
	}
	
	
	
}
