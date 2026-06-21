package Array;

public class Array2d2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[][] arr = {{10,20,30},{40,50,60},{70,80,90} };
		
		//for(float[] a1:arr) {
		for(int i= 0; i< arr.length;i++) {
			//for(float a:a1) {
			for(int j= 0;j<arr[i].length;j++) {
				//System.out.print(a + " ");
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	

}
