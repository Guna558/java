package langfunconstructor;

public class Student1 {
	int age;
	String name;
	float money;
	
	Student1 (int age,String name,float money){
		this.age = age;
		this.name = name;
		this.money = money;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s = new Student1(21,"Guna",456.8f);
				System.out.println("Student age:" +s.age);
				System.out.println("Student name:" + s.name);
				System.out.println("Student money:" + s.money);

	}

}
