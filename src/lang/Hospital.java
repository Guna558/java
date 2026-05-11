package lang;

class Hospital {
	int id;
	String name;
	double cost;
	static String hospitalName = "apllo";
	{
		id++;
	}

	void display() {
		double tax = 1200.00;
		double totalBill = cost + tax;
		System.out.println("Hospital name:" + hospitalName);
		System.out.println("patient id:" + id);
		System.out.println("Patient Name:" + name);
		System.out.println("total cost :" + cost);
		System.out.println("tax :" + tax);
		System.out.println("total bill:" + totalBill);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hospital h = new Hospital();
		h.cost = 50000.00;
		h.name = "raju";
		h.display();
		
	}

}
