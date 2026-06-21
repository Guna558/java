package Array1;

public class Minandmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		arr[0] = 2;
		arr[1] = 3;
		arr[2] = 4;
		arr[3] = 6;
		arr[4] = 9;
		arr[5] = 80;
		arr[6] = 20;
		arr[7] = 56;
		arr[8] = 26;
		arr[9] = 89;
		int min = arr[0];
		int max = arr[0];
		
		for(int i = 0;i< arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				
			}else if(arr[i]>max){
				max = arr[i];
			}
			
		}
		System.out.println("Min value:" + min);
		System.out.println("max value:" + max);



		

	}

}
