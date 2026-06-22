package Array1;

public class Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, -20, 20, -30 };

		System.out.println("Positive");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		
		System.out.println("Negative");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				System.out.print(arr[i] + " ");
			}

		}

	}

}
