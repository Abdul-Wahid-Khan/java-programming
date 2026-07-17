/* This program prints a Butterfly Pattern (or butterfly wings pattern) using stars (*) and spaces.

Note: This pattern works correctly when n is an odd number (such as 5, 7, 9). */
package Patterns;

import java.util.Scanner;

public class Pattern08 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nst = n/2; // nst = Number of stars on the left and right sides.
		int nsp = 1; // nsp = Number of spaces in the middle.
		
		// Rows
		int row = 1;
		while (row <= n) {
			
			// Star Work
			for (int cst = 1; cst <= nst; cst++) { // Prints the left half of the butterfly.
				System.out.print("*");
			}
			
			// Space Work
			for (int csp = 1; csp <= nsp; csp ++) { // Prints spaces between the two groups of stars.
				System.out.print(" ");
			}
			
			// Star Work
			for (int cst = 1; cst <= nst; cst++) { // Prints the right half.
				System.out.print("*");
			}
			
			// Preparation
			System.out.println(); // Moves to the next row.
			if(row <= n/2 ) { // While row <= n/2
				nsp = nsp + 2; // Spaces increase by 2.
				nst = nst - 1; // Stars decrease by 1.
			} else {
				nsp = nsp - 2; // Spaces decrease by 2.
				nst = nst + 1; // Stars increase by 1.
			}
			row++;
		}
		
		scn.close();

	}

}
