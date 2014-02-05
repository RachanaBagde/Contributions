/*
Program will calculate maximum Fibonacci number that is still lower than entered integer.
*/

import java.util.*; //import library for Scanner

public class Fibonacci{
	public static void main(String[] args){
		System.out.print("Enter maximum number: ");
		Scanner sc= new Scanner(System.in); //initializes scanner for console input
		int n= sc.nextInt();
		
		int a=0;
		int b=1;
		int c=0;
		
		while (a+c<=n){
			
			a+=c;
			c=b;
			b=a;
		}	
		System.out.println(a);
	}
}
