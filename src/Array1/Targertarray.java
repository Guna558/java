package Array1;

public class Targertarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50 };
		int target = 30;
		boolean status = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				System.out.println("Element found at index " + i);
				status = true;
				break;
			} else if (status) {
				System.out.println("Element not found");
			}

		}

	}

}
