package Array;

public class Sum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40};
		int sum = 0;
		for(int i = arr.length-1; i>=0;i--) {
			sum = sum + arr[i];
		}
		System.out.println("Sum:" + sum);

	}

}
