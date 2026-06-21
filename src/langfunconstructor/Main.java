package langfunconstructor;

import java.util.Scanner;

public class Main {
	int id;
	String name;
	float salary;
	
	int age;
	String address;
	Main(int id,String name,float salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	Main(int age,String address){
		this.age = age;
		this.address = address;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter id");
		int id = Sc.nextInt();
		System.out.println("Enter name");
		Sc.nextLine();
		String name = Sc.nextLine();
		System.out.println("Enter salary");
		float salary = Sc.nextFloat();
		Main m = new Main(id,name,salary);
		m.display();
		
		
		System.out.println("Enter age");
		int age = Sc.nextInt();
		System.out.println("Enter Address");
		Sc.nextLine();
		String address = Sc.nextLine();
		Main m2 = new Main(age,address);
		m2.show();
		
				
		
		
		

	}
	void display() {
		System.out.println("id"  + id);
		System.out.println("name"  + name);
		System.out.println("salary"  + salary);
	}
	void show() {
		System.out.println("age"  + age);
		System.out.println("address"  + address);
		
	}

}
