package langfunconstructor;
import java.util.Scanner;

public class User {
	int age;
	String name;
	double number;
	User(int age,String name,double number){
		this.age = age;
		this.name = name;
		this.number = number;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		//User t = new User(n1,n2,n3);
		System.out.println("Enter age");
		int n1 = Sc.nextInt();
		
		
		System.out.println("Enter name");
		Sc.nextLine();
		String n2 = Sc.nextLine();
		
		
		System.out.println("Enter number");
		double n3 = Sc.nextDouble();
		
		
		User t1 = new User(n1,n2,n3);

		t1.show();
		

	}
	void show() {
		System.out.println("Age:" + age);
		System.out.println("name:" + name);
		System.out.println("number:" + number);
	}

}
