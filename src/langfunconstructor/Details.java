package langfunconstructor;
import java.util.Scanner;

public class Details {
	int age;
	String name;
	double number;
	float marks;
	Details(int age,String name,double number,float marks){
		this. age = age;
		this.name = name;
		this .number = number;
		this.marks = marks;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter age");
		int n1 = Sc.nextInt();
		
		System.out.println("Enter name");
		Sc.nextLine();
		String n2 = Sc.nextLine();
		
		System.out.println("Enter number");
		double n3 = Sc.nextDouble();
		
		System.out.println("Enter marks");
		float n4 = Sc.nextFloat();
		
		Details d = new Details(n1,n2,n3,n4);
		d.display();

	}
	void display() {
		System.out.println("Age:" + age);
		System.out.println("name:" + name);
		System.out.println("number:" + number);
		System.out.println("marks:" + marks);
	}
	

}
