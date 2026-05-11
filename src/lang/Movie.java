package lang;

public class Movie {
	int seatnumber;
	String name;
	double cost;
	static String theatername = "Pvr";
	{
	}

	void display() {
		seatnumber = 4;
		name = "guna";
		cost = 500.0;
		System.out.println("TheaterName:" + theatername);
		System.out.println("seatnumber:" + seatnumber);
		System.out.println("Name:" + name);
		System.out.println("Ticket cost:" + cost);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double ticket = 25.9;
		double snack = 898.8;
		double totalbill = ticket + snack;
		System.out.println("totalbill:" + totalbill);
		Movie t = new Movie();
		t.display();

	}

}
