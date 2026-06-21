package langfunconstructor;

public class Studentdetails {
	String name;
	static String collegename = "NEC";
	Studentdetails(String name, String collegename){
		this.name = name;
		//this.collegename = collegename;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentdetails s = new Studentdetails("guna","v cube");
		s.display();

	}
	void display() {
		System.out.println("Name:" + name);
		System.out.println("College Name:" + collegename);
	}

}
