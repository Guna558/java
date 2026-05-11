package lang;

public class LocalVariable {
	int number = 37;
	String name = "Guna";
	
	static int no = 45;
	static String s= "Sekhar";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 37;
		String name = "Guna";
		System.out.println(number);
		System.out.println(name);
	  //	static int no = 45;
	//static String s= "Sekhar";
		System.out.println("Number:" +LocalVariable.no);
		System.out.println("Name:" +LocalVariable.s);

	}

}
