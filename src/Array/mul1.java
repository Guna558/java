package Array;

public class mul1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short num[] = new short[10];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		num[5] = 6;
		num[6] = 7;
		num[7] = 8;
		num[8] = 9;
		num[9] = 10;
		
		int mul =1;
		for(int i=0;i<num.length;i++) {//for(short num1:num){
		mul =  mul*num[i];//mul = mul*num1;
		System.out.println(mul);
		
		}
		

	}
	
}
