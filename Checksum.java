/* Credit Card Checker by MikroMan
==================================
The program accepts 16-number code of a CC and checks if
it's a valid code

Algorithm: 
http://tywkiwdbi.blogspot.com/2012/06/checksum-number-on-credit-card.html
*/

import java.util.*;

public class Checksum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter credit card number without spaces: ");
		String code = sc.nextLine();
		System.out.println();
		
		char[] c = code.toCharArray();
		int[] number = new int[c.length];
		for (int i=0; i<c.length;i++){
			number[i]=Character.digit(c[i],10);
		}
		int sum=0;
		
		for (int i=0; i<16;i+=2){
			number[i]=number[i]*2;
			if (number[i]>=10) {
				sum+=1+number[i]%10;
			} else {
				sum+=number[i];
			}
			sum+=number[i+1];
		}
		if (sum%10==0) System.out.println("Code is valid");
		else System.out.println("Code is invalid");
	}

}
