package langfunconstructor;

public class person {
	private static final boolean Male = false;
	int age;
	String name;
	boolean gender;
	float height;

	person(int age, String name, boolean gender, float height) {
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.height = height;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p = new person(21, "Guna", Male, 5.6f);
		show(p);

	}

	static void show(person p) {
		System.out.println("Enter Age:" + p.age);
		System.out.println("Entre Name;" + p.name);
		System.out.println("Enter gender:" + p.gender);
		System.out.println("Enter Height:" + p.height);

	}

}
