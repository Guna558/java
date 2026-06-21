package langfunconstructor;

public class Student {
	int age;
	float money;
	String name;

	Student() {
		age = 21;
		money = 56.2f;
		name = "Guna";

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		display(s);
		// System.out.println(s.age);
		// System.out.println(s.money);
		// System.out.println(s.name);
	}

	static void display(Student s) {
		System.out.println("Student money:" + s.age);
		System.out.println("Student money:" + s.money);
		System.out.println("Student name:" + s.name);

	}

}
