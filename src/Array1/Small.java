package Array1;

public class Small {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40};
		int small = arr[0];
		for(int i = 0;i<arr.length;i++) {
			if(small>  arr[i]) {
				small = arr[i];
			}
		}
		System.out.println("small is:" + small);

	}

}
