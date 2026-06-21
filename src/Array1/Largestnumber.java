package Array1;

public class Largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {10,20,30,20,40};
		
		int large = num[0];
		
		for(int i = 0;i<num.length;i++) {
			if(num[i]>large) {
				large = num[i];
			}
			
			
		}
		System.out.println("large NUmber:" + large);

	}

}
