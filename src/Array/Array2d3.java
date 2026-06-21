package Array;
import java.util.Scanner;

public class Array2d3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the row array");
		int  a = Sc.nextInt();
		System.out.println("Enter the coloum Array");
		int b = Sc.nextInt();
		String[][] arr = new String[a][b];
		System.out.println("Enter elements");
		for(int i= 0;i<arr.length;i++) {
			for(int j= 0;j<arr[i].length;j++) {
				arr[i][j] = Sc.next();
			}
		}
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		

	}

}
