package constructor;


public class Parent1 {
	
	int x;
	
	Parent1(){
		System.out.println("A");
	}
	Parent1(int x){
		System.out.println("B");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 p =new Parent1();
		Parent1 p1 =new Parent1(10);


	}

}
class Child extends Parent1{
	
	Child(){
		System.out.println("C");
	}
	Child(int x){
		super(x);
	
		System.out.println("D");
		
	}
	public static void main(String[] args) {
		Child c = new Child();
		Child c1 = new Child(50);
		

	}

	
	
}
