package test;

public class gctest {
	public void finalize() {
		System.out.println("finalized method");
	}
	void garbage() {
		System.out.println("Guna");
	}
	static void collecter() {
		System.out.println("test");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gctest gc = new gctest();
		gctest gc1 = new gctest();
		gc=gc1;
		
		System.gc();
		System.out.println("gc");
		gc1.collecter();
		

	}
	void collect() {
		System.out.println("test");
		
	}

}
