package langfunconstructor;

public class Box {
	int side;
	int length;
	float breadth;
	float height;
	Box(){
		side = 10;
		length = 40;
		breadth = 50.9f;
		height = 5.7f;
		System.out.println("----------------------------");
		
		
	}
	Box(int side){
		this.side=side;
		System.out.println("-------------------------------");
	}
	Box(int length,float breadth,float height){
		this.length=length;
		this.breadth = breadth;
		this.height =height;
		System.out.println("----------------------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b = new Box();
		b.show();
		
		Box b1 = new Box(20);
		b1.show();
		
		
		Box b2 = new Box(24,45.6f,5.6f);
		b2.show();
		
		

	}
	void show() {
		System.out.println("Enter side:" + side);
		System.out.println("Enter length:" + length);
		System.out.println("Enter breadth:" + breadth);
		System.out.println("Enter height:" + height);
	}

}
