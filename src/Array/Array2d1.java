package Array;

public class Array2d1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][];
		arr[0] = new int[5];
		arr[1] = new int[5];
		arr[2] = new int[5];
		
		arr[0][1] = 10;
		arr[0][2] = 20;
		arr[0][3] = 30;
		arr[0][4] = 40;
		
		
		arr[1][0] = 1;
		arr[1][1] = 2;
		arr[1][2] = 3;
		arr[1][3] = 4;
		arr[1][4] = 5;
		
		arr[2][0] = 21;
		arr[2][1] = 22;
		arr[2][2] = 23;
		arr[2][3] = 24;
		arr[2][4] = 25;
	
		
		
		
		//for(int i= 0;i< arr.length;i++) {
			for(int[] a1:arr) {
			//for(int j=0;j<arr[i].length;j++) {
				for(int a: a1) {
				//System.out.print(arr[i][j] + " ");
					System.out.print(a + " ");
				
			}
			System.out.println();
		}
		
		
		
		
		

	}

}
