package Array1;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,30,50,20,60};
		int count = 0;
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
					System.out.println("Dupicate:" +arr[i]);
					System.out.println(count);
					
				}
				
			}
		}

	}

}
