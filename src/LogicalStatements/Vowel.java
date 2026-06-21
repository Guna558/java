package LogicalStatements;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter letter");
		char ch = Sc.next().charAt(0);
		
		if(ch == 'a' ||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u' ) {
			System.out.println("It is ovwel");
			
		}else {
			System.out.println("Not ovwel");
		}

	}

}
