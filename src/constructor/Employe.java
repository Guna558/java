package constructor;

public class Employe {
	int id;
	String name;
	double salary;
	Employe(int id,String name,double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}

	public static void main(String[] args) {
		
	}

}
class Manager extends Employe {
	Manager(){
		super(101,"Guna",30000.0f);
		System.out.println("Manager");
		
	}
	public static void main(String[] args) {
		Manager m = new Manager();
		m.display();

	}



void display() {
	System.out.println("Id:" + id);
	System.out.println("name:" + name);
	System.out.println("salary:" + salary);

}
}
