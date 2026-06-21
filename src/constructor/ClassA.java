package constructor;

public class ClassA {
	 int x;

	ClassA(int x){
		this.x= x;
		System.out.println(x);
	}


	public static void main(String[] args) {
		ClassA c =new ClassA(10);
		//System.out.println(x);
		
	}

}
class ClassE extends ClassA{
	ClassE(){
		super(10);
		System.out.println("B");
		
		ClassE b = new ClassE();
		
	}
//	public static void main(String[] args) {
//		ClassE b = new ClassE();
//	}
//	
	
}
