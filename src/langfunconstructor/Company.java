package langfunconstructor;

public class Company {
	String Companyname;
	String Companylocation;

	Company(String Companyname, String Companylocation) {
		this.Companyname = Companyname;
		this.Companylocation = Companylocation;

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

class Worker extends Company {
	int empid;
	String empname;

	Worker(int empid, String empname) {
		super("Tcs", "hyd");
		this.empid = empid;
		this.empname = empname;

	}

	public static void main(String[] args) {
		Worker e = new Worker(101, "Guna");
		e.display();
	}

	void display() {
		System.out.println("Compoany Name:" + Companyname);
		System.out.println("Compoany Location:" + Companylocation);
		System.out.println("emp id:" + empid);
		System.out.println("emp Name:" + empname);
	}
}
