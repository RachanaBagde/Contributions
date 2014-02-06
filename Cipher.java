/*
Caesar cipher by MikroMan
========================
Implements single encoding of entered text, can
output all possible decrypted texts given an encoded text.
*/

import java.util.*;
public class Cipher{
	public static void main(String[] args){
		char[] A = {'a','b','c','d','e','f','g','h','i','j','k','l',
		'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter text to be encoded: ");
		String text = sc.nextLine();
		
		System.out.print("Enter an integer for cypher: ");
		int n= sc.nextInt();	
		char[] c = text.toCharArray(); //entered text to an array of letters
		char[] out = encodeText(c,n,A);
		System.out.print("Encoded text: ");
		printCode(out);
		System.out.println();
		System.out.println();
		
		String ignore = sc.nextLine();
		System.out.print("Enter text to be decoded: ");
		String textD = sc.nextLine();	
		char[] dec = textD.toCharArray();
		decodeText(dec, A);		
	}
	public static char[] encodeText(char[] c, int n,char[] A){
		char[] o = new char[c.length]; //create an array to output encrypted message
		for (int i=0; i<c.length;i++){
			//if array elemnt is punc. mark or space, copy it
			if (c[i]==' ' || c[i]=='.' || c[i]==',') o[i] = c[i]; 
			//else, find in alphabet and shift for n
			else {
				alph: for (int j=0;j<A.length;j++){
					if (A[j]==c[i]){
					o[i] = A[(j+n)%A.length];
					break alph;
					}
				}
			}
		}
		return o;
	}
	public static void decodeText(char[] e,char[] A){
		for (int i=1;i<=25;i++){
			char[] decode = encodeText(e,i,A);
			printCode(decode);
			System.out.print(" - Shifted by "+i+" letters.");
			System.out.println();
		}
	}
	public static void printCode(char[] out){
		for (int i=0; i<out.length;i++){
			System.out.print(out[i]);
		}
	}
}