package langfunconstructor;

public class Cricket {
	String  country;
	int id;
	
	String name;
	int num;
	int age;
	Cricket(String country,int id){
		System.out.println("Indian Cricket Team");
		this .country = country;
		this.id = id;
		
	}
	Cricket(String name,int num,int age){
		this.name = name;
		this.num = num;
		this.age = age;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cricket c = new Cricket("India",90); 
		
		Cricket c1 = new Cricket("MSD",7,65);
		
		Cricket c2 = new Cricket("Virat",18,35);
		
		Cricket c3 = new Cricket("Rohit",92,40);
		
		System.out.println("Country:" + c.country);
		System.out.println("ID:" + c.id);
		
		System.out.println("Cricketer Name:" + c1.name);
		System.out.println("Cricketer Number:" + c1.num);
		
		System.out.println("Cricketer Name:" + c2.name);
		System.out.println("Crickete Number:" + c2.num);
		
		System.out.println("Cricketer Name:" + c3.name);
		System.out.println("Cricketer Number:" + c3.num);
		
		
	}

}
