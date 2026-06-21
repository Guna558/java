package Array;

public class Sum {
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int sum =0;
		
		for(int i = 0; i<arr.length;i++) {
		sum = sum + arr[i];
		}
		System.out.println("Sum:" +sum);

	}
}
