package Array1;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] num = new double[6];
		num[0] = 2;
		num[1] = 6;
		num[2] = 7;
		num[3] = 8;
		num[4] = 9;
		num[5] = 3;
		double sum = 0;
		for(int i =0;i<num.length;i++) {
			sum = sum +num[i];
			
		}
		System.out.println("sum is:" + sum);
		
		

	}

}
