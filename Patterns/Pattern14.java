// This Java program prints a palindromic number pyramid. The numbers first increase up to the middle of each row and then decrease, creating a symmetric pattern.
package Patterns;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nst = 1 ;
		int nsp = n - 1 ;
		int val = 1 ; // Every row starts printing from 1.
		
		// Rows
		int row = 1 ;
		while (row <= n) {
			
			val = 1;
			
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t"); // Prints spaces before the numbers.
			}
			
			// Stars(Print Number)
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val + "\t"); 
				// It prints numbers and changes val based on the position in the row.
				if(cst <= nst / 2) // The row is divided into two parts: First half: increase the value and Second half: decrease the value.
					val++;
				else
					val--;
			}
			
			// Preparation
			System.out.println();
			nsp--; 
			nst+=2; 
			row++; 
		}
		
		scn.close();
	}

}