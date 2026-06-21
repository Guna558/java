package langfunconstructor;

public class Count {
	static int count = 0;
	Count(){
		count++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		c1.display();
		c2.display();
		c3.display();
		

	}
	void display() {
		System.out.println("total:" + count);
	}
	

}
