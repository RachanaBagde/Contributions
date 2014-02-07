/* Change Return by Mikroman
===========================
*/

import java.util.*;
public class Change{
	public static void main(String[] args){
		//arrays are configurable for anny currency
		//just change names and values (must be 1/100 euro, dollar, etc.)
		String[] coins ={"quarters","dimes","nickels","pennies"};
		int[] value = {25,10,5,1}; //values in pennies
		int[] give = new int[coins.length];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter price: ");
		double price = sc.nextDouble()*100; //price in pennies
		System.out.print("Enter the paid amount: ");
		double paid = sc.nextDouble()*100; //paid in pennies
		
		if (price > paid){
			System.out.println("Not enough money.");
			System.exit(0);
		} else if (paid == price){
			System.out.println("Nothing to return");
			System.exit(0);
		
		}
		int change = (int)paid-(int)price;
		for (int i=0;i<value.length; i++){
			give[i]= (int)change/value[i];
			change=change%value[i];
			System.out.printf("To return: %d %s\n",give[i],coins[i]);
		}
	}
}
