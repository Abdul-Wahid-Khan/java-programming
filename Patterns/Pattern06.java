// This Java program prints an inverted right-aligned triangle using nested while loops.
package Patterns;

import java.util.Scanner;

public class Pattern06 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(); 
		
		int nsp = 0 ; // Number of Spaces
		int nst = n ; // Number of Stars
		
		// Row 
		int row = 1 ;
		while (row <= n) {
			
			// Spaces Work
			int csp = 1 ;
			while (csp <= nsp) { // Prints spaces before the stars.
				System.out.print(" ") ;
				csp++ ;
			}
			
			// Stars Work
			int cst = 1 ;
			while (cst <= nst) { // Prints stars.
				System.out.print('*');
				cst++ ;
			}
			
			// Preparation
			System.out.println();
			nst = nst - 1 ; // Stars decrease by 1
			nsp = nsp + 1 ; // Spaces increase by 1
			row = row + 1 ; // Move to the next row  
		}
		scn.close();
	}

}
