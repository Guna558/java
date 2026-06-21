package Array;

public class sum2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num = {{10,20,30},{40,50,60},{70,80,90}};
		int sum = 0;
		int count = 0;
		for(int i= 0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				sum = sum  + num[i][j];
				count++;
				
			}
		}
		int avg = sum/count;
		System.out.println("sum:" + sum);
		System.out.println("Avg:" + avg);
			
		}

}
