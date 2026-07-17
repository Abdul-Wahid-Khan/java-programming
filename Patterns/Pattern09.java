/* This Java program prints a diamond pattern (made of stars) using spaces and stars.

Note: This program works correctly when n is an odd number (such as 5, 7, 9). */
package Patterns;

import java.util.Scanner;

public class Pattern09 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nst = 1;
		int nsp = n/2;
		
		// Rows
		int row = 1;
		while (row <= n) {
			
			// Space Work
			for (int csp = 1; csp <= nsp; csp ++) { // Prints the leading spaces before the stars.
				System.out.print(" ");
			}
			
			// Star Work
			for (int cst = 1; cst <= nst; cst++) { // Prints the stars.
				System.out.print("*");
			}
			
			// Preparation
			System.out.println(); 
			if(row <= n/2 ) { 
				nsp = nsp - 1; // Spaces decrease by 1.
				nst = nst + 2; // Stars increase by 2.
			} else {
				nsp = nsp + 1; // Spaces increase by 1.
				nst = nst - 2; // Stars decrease by 2.
			}
			row++;
		}
		
		scn.close();

	}

}
