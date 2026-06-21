package LogicalStatements;

import java.util.Scanner;

public class Switchreturn {
	static String getmonthinfo(int month) {

		String result = switch(month) {
		case 1-> "jan";
			
		case 2 ->"feb";
			
		case 3->"march";			
		case 4->"April";
			
		case 5->"may";
			
		case 6 ->"june";
			
		case 7 ->"july";
			
		case 8 ->"aug";
		case 9 ->"sep";
			
		case 10 ->"oct";
			
		case 11 ->"nov";
			
		case 12 ->"dec";
		default -> "invalid";
		
		};
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter month");
		int month = Sc.nextInt();
		System.out.println("result:" + getmonthinfo(month));

	}

}
