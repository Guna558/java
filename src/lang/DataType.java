package lang;

public class DataType {
	byte b = 1;//1 byte -->8 bits
	short s;//2 bytes-->16 bits
	int i = b;//4 bytes-->32 bits
	long L;//8 bytes-->64 bits
	float f;//4 bytes-->32 bits
	double d;//8 bytes-->64 bits
	char c;//2 bytes-->32 bits
	boolean ft;//1 bit
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataType t = new DataType();
		System.out.println("byte :" + t.b);
		System.out.println("short :" + t.s);
		System.out.println("int :" + t.i);
		System.out.println("long :" + t.L);
		System.out.println("float :" + t.f);
		System.out.println("double:" + t.d);
		System.out.println("char :" + t.c);
		System.out.println("boolean :" + t.ft);
		

	}

}
