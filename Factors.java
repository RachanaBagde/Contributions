/* Prime Factors by Mikroman
============================
Find prime factors of a number if there are any
*/

import java.util.*;

public class Factors{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int n = sc.nextInt();
		System.out.print("Prime factors: ");
		
		for (int i=2;i<=n;i++){
			if (n%i == 0 && isPrime(i)) System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static boolean isPrime(int p){
		boolean prime = true;
		isPrime: for (int i=2; i<=p/2;i++){
			if (p%i==0) {
				prime=false;
				break isPrime;
			}
		}
		return prime;
	}
}
