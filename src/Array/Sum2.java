package Array;

public class Sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float arr[] = new float[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;

		arr[4]=5;
		//arr[5]=6;
		float sum = 0;
		for(float num : arr) {
			sum = sum + num; 
			
		}
		System.out.println("Sum:" + sum);



	}

}
