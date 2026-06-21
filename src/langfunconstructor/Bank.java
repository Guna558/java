package langfunconstructor;

public class Bank {
	double amount;
	Bank(double amount){
		this.amount = amount;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank(1000);
         b.deposit();
	}
	void deposit() {
		//balance = balance + amount;
		System.out.println(amount);
		
	}

}
