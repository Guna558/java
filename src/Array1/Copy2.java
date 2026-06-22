package Array1;

public class Copy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 20, 30 };
		int[] b = { 40, 50, 60 };
		int[] c = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];

		}
		
		for(int i = 0;i<c.length;i++) {
			System.out.println("sum:" + c[i]);
		}

	}

}
