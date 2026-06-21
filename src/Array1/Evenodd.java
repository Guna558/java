package Array1;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int even = 0;
		int odd = 0;

		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2 ==0) {
				System.out.println("Even is:" + arr[i]);
				
				
			}else {
				System.out.println("odd is:" + arr[i]);
				
				
			}
			


		}
		
	}
}
