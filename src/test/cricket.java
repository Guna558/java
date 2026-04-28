package test;

import java.net.MulticastSocket;

public class cricket {
	//instance
	String CricketName;
	int Number;
	//static
	static String Country;
	static int Id;
	

	public static void main(String[] args) {
		System.out.println("cricket team");
		
		
		//static
		Country="india";
		Id = 90;
		System.out.println("Country:"+ Country);
		System.out.println("Id:"+Id);
		//instance
		cricket msd = new cricket();
		msd.CricketName = "msd";
		msd.Number = 7;
		System.out.println("CricketName:"+ msd.CricketName);
		System.out.println("Number" + msd.Number);	
		cricket virat = new cricket();
		virat.CricketName = "Virat";
		virat.Number = 18;
		System.out.println("CricketName:" + virat.CricketName);
		System.out.println("Number:" + virat.Number);
		cricket rohit = new cricket();
		rohit.CricketName ="rohit";
		rohit.Number = 92;
		System.out.println("CricketName" + rohit.CricketName);
		System.out.println("CricketName" + rohit. Number);
		
		
		
		
		
		
		

	}

}
