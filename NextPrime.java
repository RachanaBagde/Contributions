/*
Next Prime Number Search by MikroMan
====================================
Program will keep searching for next prime number until user ends program. 
*/

import java.util.*; //import library for scanner

public class NextPrime{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in); 
		int p=2; //first prime
		int n=1; //sequential number of a prime number
		System.out.printf("%d. prime number is %d\n\n",n,p);
		while (true){
			
			System.out.print("Do you want to continue(y/n)? "); //user input
			String check = sc.nextLine();
			if (check.equals("y")){ 
				
				boolean prime = false;
				while (prime != true){
					boolean p2 = true;
					p++;
					for (int i=2; i<=p/2;i++){ //loop for checking if a number is prime
						if (p%i==0){
							p2= false;
						}
					}
					if (p2==true) {
						prime =true;
						n++;
					}
				}
				System.out.printf("%d. prime number is %d\n\n",n,p);
			} else {
				System.exit(0);
			}
		}
	}
}