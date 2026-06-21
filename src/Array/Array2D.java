package Array;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] arr = new String[2][];
		arr[0] = new String[3];
		arr[1] = new String[3];
		
	
		arr[0][0] = "Guna";
		arr[0][1] = "Sekhar";
		arr[0][2] = "Reddy";

		arr[1][0] = "NRT";
		arr[1][1] = "babu";
		arr[1][2] = "Ranjan";
		//for (int i=0;i< arr.length;i++) {
		for(String[] a:arr) {
			//for(int j= 0;j< arr[i].length;j++) {
			for(String a1:a) {
			//	System.out.print(arr[i][j] + " ");
				System.out.print(a1 + " ");
			}
			System.out.println();
		}

	}

}
