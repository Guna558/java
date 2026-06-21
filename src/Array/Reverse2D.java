package Array;

public class Reverse2D {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		
		
		for(int i=arr.length-1;i>=0;i--) {
			for(int j=arr[i].length-1;j>=0;j--) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
			
			
		}
	}

}
