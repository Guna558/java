package langfun;
import java.util.Scanner;

public class Employee {
	double Employee;
	static Scanner Sc = new Scanner(System.in); 
	double salary() {
		System.out.println("Enter the salary");
		double salary = Sc.nextDouble();
		return  salary;
	}
	double Bonus() {
		System.out.println("Enter your Bonus");
		double Bonus = Sc.nextDouble();
		return Bonus;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		double sal=e.salary();
		double bon = e.Bonus();
		System.out.println("Total Salary:" + (sal+bon));

	}

}
