package Loops;
import java.util.*;

public class PrimeNFirst {
	
	static boolean isprime(int n) {
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main (String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Numbe of primes : ");
		int n=s.nextInt();
		
		int[] parr = new int[n];
		int num=2,i=0;
		while (i<n) {
			if(PrimeNFirst.isprime(num)) {
				parr[i]=num;
				i++;
			}
			num++;
		}
		for(int j=0;j<parr.length;j++) {
			System.out.println(parr[j]);
		}
		
	}
}
