package Array;

public class Large {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10 ,25, 8, 45, 12};
		int large = arr[0];
		
		for(int a:arr) {
			if(a>large) {
				large = a;
			}
		}
		System.out.println("Large number is :" + large);
		

	}

}
