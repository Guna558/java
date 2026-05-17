package langfun;
class employee1 {
int a = 20;
String s ="guna";
long l = 895666666l;
public String name;
}

public class Abstactmethod {
	employee1 getdetails() {
	employee1 e = new employee1();
	return e;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstactmethod a = new Abstactmethod();
		employee1 e =a.getdetails();
		System.out.println("e id" + e.a);
		System.out.println("e name" + e.s);
		System.out.println("e number" + e.l);
		
		

	}

}
