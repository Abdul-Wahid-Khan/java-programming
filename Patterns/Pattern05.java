package Patterns;

import java.util.Scanner;

public class Pattern05 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(); 
		
		int nsp = n - 1 ; // Number of Spaces
		int nst = 1 ; // Number of Stars
		
		// Row 
		int row = 1 ;
		while (row <= n) {
			
			// Spaces Work
			int csp = 1 ;
			while (csp <= nsp) { // Prints the required number of spaces before the stars.
				System.out.print(" ") ;
				csp++ ;
			}
			
			// Stars Work
			int cst = 1 ;
			while (cst <= nst) {
				System.out.print('*'); // Prints stars.
				cst++ ;
			}
			
			// Preparation
			System.out.println();
			nst = nst + 1 ; // Increase stars by 1
			nsp = nsp - 1 ; // Decrease spaces by 1
			row = row + 1 ; // Move to the next row
		}
		scn.close();
	}

}
 