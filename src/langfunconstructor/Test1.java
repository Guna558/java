package langfunconstructor;

public class Test1 {
	int age;
	String name;
	long number;
	Test1(){
		this(21, "Guna",885642508l);
	}
	Test1(int age,String name,long number){
		this(age,name);
		this.number = number;
		
	}
	Test1(int age,String name){
		this.age = age;
		this.name = name;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1  t = new Test1();
		t.display();
		
		Test1  t1 = new Test1();
		t1.display();
		
		Test1  t2 = new Test1();
        t1.display();
	}
	void display() {
		System.out.println("Age:" + age) ;
		System.out.println("NAme:" + name) ;
		System.out.println("number:" + number) ;
	}
	

	

}
