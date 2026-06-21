package langfunconstructor;

public class Account {
	double balance;

	Account() {
		double balance = 56000.0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account();
		a.deposit(20000);
		a.withdraw(30000);

		a.display();

	}

	void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposit:" + balance);

	}

	void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdraw:" + balance);
	}

	void display() {
		System.out.println("Final balance:" + balance);
	}

}
