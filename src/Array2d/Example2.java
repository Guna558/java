package Array2d;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{10,20,30},{40,50,60}};
		int[][] arr1 = {{1,2,3},{4,5,6}};
		
		int[][] result = new int[2][3];
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				result[i][j] = arr[i][j] + arr1[i][j]; 
				
			}
		}
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}


	}

}
