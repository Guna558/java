package constructor;

public class Employee1 {
	int id;
	String name;
	double salary;
	Employee1(int id,String name,double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Manager1 extends Employee1{
	double bonous;
	
	Manager1(double bonous){
		super(101,"Guna",20000.0);
		this.bonous = bonous;
		
	}
	public static void main(String[] args) {
		
		Manager1 m = new Manager1(20000.0);
		m.display();

	}
	void display() {
		double total = salary + bonous;
		System.out.println("Id:" + id);
		System.out.println("Name:" + name);
		System.out.println("Salary:" + salary);
		System.out.println("Bonous:" + bonous);
		System.out.println("Total :" + total);
		
	}
}
