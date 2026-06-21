package Array;

public class Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] num = new double[5];
		
		num[0] = 1;
		num[1] = -2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		//num[5] = 6;
		double min = num[0];
		double max=num[0];
		
		//for(int i = 1; i<num.length;i++) {
			for(double number:num) {
		
			
			if(number<min) {
				min = number;
				
			}
			else if (number>min) {
				max = number;
			}
		}
	System.out.println("Max value:" + max);
		System.out.println("Min value:" + min);
		

	}

}
