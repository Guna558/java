package constructor;

public class BankAccount {
	int accno;
	double balance;
	BankAccount(int accno,double balance){
		this.accno = accno;
		this.balance = balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class SavingsAccount extends BankAccount {
	double interstRate;
	SavingsAccount(int accno,double balance,double interstRate){
		super( accno, balance);
		this.interstRate = interstRate;
		
	}
	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount(101,30000.0,50);
		s.show();

	}
	void show() {
		double interst = (balance *interstRate)/100;
		double totalbalance = balance + interst;
		System.out.println("AccNo:" + accno);
		System.out.println("balance:" + balance);
		System.out.println("Interstrate:" + interstRate);
		System.out.println("interst:" + interst);
		System.out.println("totalbalance:" + totalbalance);
	}
	

	
}

