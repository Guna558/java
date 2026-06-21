import java.util.Scanner;
import java.util.Random;
public class Guess1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		String s;
		do {
			Random r = new Random();
			int random = r.nextInt(10);
			int i = 1;
			do {
				System.out.println("Enter a number");
				int n = Sc.nextInt();
				if (n == random) {
					System.out.println("Sucessfuly guess");
					break;
				} else {
					System.out.println("Wrong guess");
				}
				i++;

			} while (i <= 3);
			if (i == 4) {
				System.out.println("Faild !Correct number is:" + random);
			}
			System.out.println("If you want to continue, yes or no");
			s = Sc.next();

		} while (s.equalsIgnoreCase("Yes"));
		System.out.println("Exit");
	}

}
