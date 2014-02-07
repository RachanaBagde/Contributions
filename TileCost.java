/*
Calculate the total cost of tile it would take to cover a floor 
plan of width and height, using a cost entered by the user.
Widthe and height are integers, cost of tiles is a decimal number
*/

import java.util.*; //import library for scanner

public class TileCost{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter width of your floor plan: ");
		int w = sc.nextInt();
		
		System.out.print("Enter height of your floor plan: ");
		int h = sc.nextInt();
		//Note: scanner for double (decimal number) will use your 
		//default Locale to determine decimal separator (. or,).
		//Uncomment the next line to change it to US locale, that uses . (dot)
		//sc.useLocale(Locale.US);
		
		System.out.print("Enter cost of tiles per square meter: ");
		double cost = sc.nextDouble();
		System.out.println();
		
		System.out.printf("Total cost of tile for %d square meters if %.2f EUR\n", h*w,h*w*cost);
		
	}
}
