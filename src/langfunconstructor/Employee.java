package langfunconstructor;

public class Employee {
	 int id;
	String name;
	 float salary;
	Employee(){
		this(10);
	}
	Employee(int id){
		this(id,"guna");
		this.id=id;
		
	}
	Employee(int id,String name){
		this(id,name,30000.0f);
//		this.id=id;
//		this.name=name;
		
	}
	Employee(int id,String name,float salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.display();
	
		

	}
	void display() {
		System.out.println("Id:" + id);
		System.out.println("name:" + name);
		System.out.println("salary:" + salary);
		
	}

}
