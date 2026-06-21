package constructor;

public class Employee {
	int id;
	String name;
	double Salary;
	
	Employee(int id,String name,double Salary){
		this .id = id;
		this.name = name;
		this.Salary = Salary;
	}
	Employee(Employee e){
		this.id = e.id;
		this.name =e. name;
		this.Salary = 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(19,"Guna",2000.0);
		e1.show();
		Employee e2 = new Employee(e1);
		e2.show();
		

	}
	void show() {
		System.out.println("id:" + id);
		System.out.println("name:" + name);
		System.out.println("salary:" + Salary);
		//System.out.println("id:" + id);
	}

}
