/*
Next Prime Number Search by MikroMan
====================================
Program will keep searching for next prime number until user ends program. 
*/

import java.util.*; //import library for scanner

public class NextPrime{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in); 
		int nextPrime=2; //first prime
		int n=1; //sequential number of a prime number
		System.out.printf("%d. prime number is %d\n\n",n,nextPrime);
		while (true){
			
			System.out.print("Do you want to continue(y/n)? "); //user input
			String check = sc.nextLine();
			if (check.equals("y")){ 
				
				boolean isPrime = false;
				while (isPrime != true){
					boolean primeCheck = true;
					nextPrime++;
					for (int i=2; i<=nextPrime/2;i++){ //loop for checking if a number is prime
						if (nextPrime%i==0) primeCheck= false;
					}
					if (primeCheck==true) {
						isPrime =true;
						n++;
					}
				}
				System.out.printf("%d. prime number is %d\n\n",n,nextPrime);
			} else {
				System.exit(0);
			}
		}
	}
}
