package Array;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		
		int even = 0;
		int odd = 0;
		
		for(int i = 0;i<num.length;i++) {
			if(num[i] %2 == 0) {
				even++;
			}
			else {
				odd++;
				
				
			}
		}
		System.out.println("Even:" + even);
		System.out.println("odd:" + odd);

	}

}
