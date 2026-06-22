package Array1;

public class Seconglargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40 };

		int large = arr[0];
		int secondlarge = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large) {
				secondlarge = large;
				large = arr[i];

			} else {
				secondlarge = arr[i];
			}
		}
		System.out.println(" large:" +large);
		System.out.println("Second large:" +secondlarge);

	}

}
