package lang;

public class student {
	byte b;
	short s;
	int i;
	long L;

	void show() {
		b = 21;
		s = 45;
		i = 106;
		L = 78687095680L;
		System.out.println("byte :" + b);
		System.out.println("short :" + s);
		System.out.println("int :" + i);
		System.out.println("long :" + L);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student v = new student();
		v.show();

	}

}
