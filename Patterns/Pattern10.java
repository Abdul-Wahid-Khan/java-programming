/* This Java program prints a hollow pyramid/V-shaped mirrored star pattern by printing:
Stars on the left
Spaces in the middle
Stars on the right */
package Patterns;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nst = 1; // nst = Number of stars on each side
		int nsp = 2 * n - 3; // nsp = Number of spaces between the two groups of stars
		
		// Rows
		int row = 1;
		while (row <= n) {
			
			// Stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}
			
			// Spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			
			int cst = 1; // In the last row: This prints the middle star twice because there are no spaces left between the two halves.
			if (row == n) { // The second star loop starts from 2 instead of 1.
				cst = 2; // So it skips the first star of the right half.
			}
			// Stars
			for (; cst <= nst; cst++) {
				System.out.print("*");
			}
			
			// Preparation
			System.out.println();
			nst = nst + 1;
			nsp = nsp - 2;
			row = row + 1;
		}
		
		scn.close();

	}

}
