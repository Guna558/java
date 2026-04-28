package test;

public class Many {
	public void method1(int i,int j) {
		int sum = i+j;
		System.out.println("this is the value of sum" + sum);
		
	}
	public void method1( float b,float c) {
		 float sum = b+c;
		 System.out.println("this is the value of float" + sum);
		 
	}
	public void method1(String i, String j) {
		String sum = i+j;
		System.out.println("this is the string:" + sum);
	
	}
	public void method1() {
		System.out.println("hello this is mee ");
	}
	public void method1(int i) {
		int sum =i+i;
		System.out.println("this is i vauee" + sum);
		
	}
	public static void main(String[] args) {
	Many m =new Many();
	m.method1(12);
	m.method1();
	m.method1(10, 20);
	m.method1(12.6f, 12.6f);
	m.method1("hello",   "chello");
	}

}
