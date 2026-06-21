package constructor;

public class Account {
	int accno;
	static int count =0;
	Account(int accno){
		this.accno = accno;
		count++;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account(101);
		Account a2 = new Account(102);
		Account a3 = new Account(102);
		
		a1.display();
		a2.display();
		a3.display();
		
		
		Account.show();

	}
	void display() {
		System.out.println("Account number:" + accno);
	}
	static void show() {
		System.out.println("Count:" + count);
	}
	

}
