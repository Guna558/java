package lang;

public class variable {
	int a = 21;
	String s = "Reddy";
	static int b = 20;
	static String t = "Guna";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Accessing directly
		System.out.println("Age :"+ b);
		System.out.println("Name :"+ t);
		variable v = new variable();
//Accessing class name
		System.out.println("Age:"+variable.b);
		System.out.println("Name :" + variable.t);
//Accessing object refrance
		System.out.println("Age :" +v.a);
		System.out.println("Name:"+v.s);
		

	}

}
