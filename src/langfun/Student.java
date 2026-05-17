package langfun;

import java.util.Scanner;

public class Student {
	static void getthestudentname(String name) {
		System.out.println("Student Name:" + name);

	}

	static void getthenumber1(long number) {
		System.out.println("Student Mobile Number:" + number);
	}

	static void gettherollnumber(int rnumber) {
		System.out.println("Student Roll Number:" + rnumber);
	}

	static void getthecollege(String cname) {
		System.out.println("Student college Name:" + cname);
	}

	static void gettheaddress(String aname) {
		System.out.println("Student Address:" + aname);
	}

	static void gettheclass(int cnumber) {
		System.out.println("Student class:" + cnumber);
	}

	static void getthefriend(String fname) {
		System.out.println("Student Friend:" + fname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		getthestudentname(name);
		System.out.println("Enter your Number");
		long number = sc.nextLong();
		getthenumber1(number);
		System.out.println("Enter Your RollNumber");
		int rname = sc.nextInt();
		gettherollnumber(rname);
		System.out.println("Enter College Name");
		sc.nextLine();
		String cname = sc.nextLine();
		getthecollege(cname);
		System.out.println("Enter Your Address ");
		sc.nextLine();
		String aname = sc.nextLine();
		gettheaddress(aname);
		System.out.println("Enter your class");
		int cnumber = sc.nextInt();
		gettheclass(cnumber);
		System.out.println("Enter Your Friend Name");
		sc.nextLine();
		String fname = sc.nextLine();
		getthefriend(fname);
		sc.close();

	}

}
