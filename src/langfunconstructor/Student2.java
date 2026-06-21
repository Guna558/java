package langfunconstructor;

public class Student2 {
	int age;
	String name;
	String course;
	Student2(){
		this(21,"guna");
	}
	Student2(int age,String name){
		this .age = age;
		this.name = name;
		
	}
	Student2(int age,String name,String course){
		this(age,name);
		this.course = course;
		
	}

	public static void main(String[] args) {
		Student2 s = new Student2();
		s.display();
		Student2 s1= new Student2(22,"Reddy");
		s1.display();
		
		
		Student2 s2 = new Student2(23,"Sekhar","CSE");
		s2.display();
		
	}
	void display() {
		System.out.println("age:" + age);
		System.out.println("name:" + name);
		System.out.println("course:" + course);
	}
}
