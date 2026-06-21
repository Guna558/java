package LogicalStatements;

import java.util.Scanner;

public class Week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Day");
		int Num = Sc.nextInt();
		
		if(Num == 1) {
			System.out.println("Monday");
		}else if(Num == 2) {
			System.out.println("tuesday");
		}else if(Num == 3) {
			System.out.println("Wednesday");
		}else if(Num == 4) {
			System.out.println("Thursday");
		}else if(Num == 5) {
			System.out.println("Friday");
		}else if(Num == 6) {
			System.out.println("Saturday");
		}else if(Num==7) {
			System.out.println("sunday");
		}else {
			System.out.println("invalid");
		}

	}

}
