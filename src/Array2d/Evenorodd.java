package Array2d;

public class Evenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,},{4,5,6},{7,8,9}};
		
		int even = 0;
		int odd = 0;
		
		//int count = 0;
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				if(arr[i][j]%2 == 0) {
					System.out.println( arr[i][j] + " even");
				}else if(arr[i][j]%2 != 0) {
					System.out.println(arr[i][j]+ "odd");
				}
				
				
			}
			
			
		}
		//System.out.println("even number:" + arr);
		
	}

}
