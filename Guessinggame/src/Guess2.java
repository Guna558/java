import java.util.Scanner;
import java.util.Random;
public class Guess2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		
		Random r = new Random();
		int Random = r.nextInt(10);
		for(int i = 1;i<=3;i++) {
			System.out.println("Enter a number");
			int n = Sc.nextInt();
			if(n==Random) {
				System.out.println("Sucessfuly guess");
			}else {
				System.out.println("Wrong guess");
			}
			if(i==3){
				System.out.println("Failed corrrect number is:" + Random);
			}
		}

	}

}
