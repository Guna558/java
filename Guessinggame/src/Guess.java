import java.util.Random;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);

		Random r = new Random();
		int random = r.nextInt(10);
		int i = 1;

		while (i <= 3) {
			System.out.println("Enter a number");
			int n = Sc.nextInt();
			if (n == random) {
				System.out.println("Sucessfully guess");
				break;
			} else {
				System.out.println("Wrong guess");
			}
			i++;
		}
		
		if (i == 4) {
			System.out.println("failed:" + random);

		}

	}

}
