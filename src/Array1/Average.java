package Array1;



public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40};
		int sum = 0;
		int avg = 0;
		for(int i = 0;i<arr.length;i++) {
			sum = sum +arr[i];
			
		}
		avg = avg/arr.length;
		System.out.println(sum);
		System.out.println(avg);
	}
		
			
}
