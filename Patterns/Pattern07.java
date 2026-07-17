// This program prints a diamond-like increasing and decreasing triangle of stars. The stars increase until the middle row and then the stars decrease.
package Patterns;

import java.util.Scanner;

public class Pattern07 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nr = 2 * n - 1; // nr means Number of Rows.
		int nst = 1; // Number of stars to print in the current row.
		
		// Row
		int row = 1;
		while (row <= nr) {
			
			// Work
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			
			// Preparation 
			System.out.println();
			if (row <= nr / 2) { // This decides whether to: Increase stars and Decrease stars
				nst = nst + 1;
			} else {
				nst = nst - 1;
			}
			
			row = row + 1;
			
		}
		scn.close();

	}

}
