// This Java program prints a number pyramid. Instead of printing *, it prints the same number (1) in each row.
package Patterns;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nst = 1 ; // Number of values to print
		int nsp = n - 1 ; // Number of leading spaces
		int val = 1 ; // Number to print 1
		
		// Rows
		int row = 1 ;
		while (row <= n) { // This loop controls the number of rows.
			
			// Spaces
			for (int csp = 1; csp <= nsp; csp++) { // This prints spaces before the numbers.
				System.out.print(" ");
			}
			
			// Stars(Print Number)
			for (int cst = 1; cst <= nst; cst++) { // The number of times 1 is printed depends on nst.
				System.out.print(val);
			}
			
			// Preparation
			System.out.println();
			nsp--; // Decreases the spaces.
			nst+=2; // Increases the number of printed values.
			row++; // Moves to the next row.
		}
		
		scn.close();
	}

}
