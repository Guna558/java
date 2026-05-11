package lang;

public class bank {
	int accno;
	String name;
	double balance;
	static int count=1234556;{
		count++;
		bank();{
			accno++;
		}
	}

	void display() {
		accno = 1234556;
		name = "guna";
		balance = 100000.0;
		System.out.println("Account Number:" + accno);
		System.out.println("Name :" + name);
		System.out.println("Balance :" + balance);
	}

	private void bank() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank t1 = new bank();
		t1.display();
		
	

	}

}
