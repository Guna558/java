package Array1;

public class copyonetoanother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40};
		
		int[] arr1 = new int[arr.length];
		for(int i = 0;i<arr.length;i++) {
			arr1[i] = arr[i];
		}
			for(int i = 0;i<arr1.length;i++) {
				System.out.println(arr[i]+ " " );
			
		}

	}

}
