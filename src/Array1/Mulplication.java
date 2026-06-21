package Array1;

public class Mulplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] num = new double[4];
		num[0] = 24253;
		num[1] = 4353;
		num[2] = 3426234;
		num[3] = 436234;
		double mul =0;
		for(int i = 0;i<num.length;i++) {
			mul = mul*num[i];
		}
		System.out.println(mul);
	}

}
