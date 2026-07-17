// This Java program prints a number pyramid where each row contains the row number.
package Patterns;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nst = 1 ;
		int nsp = n - 1 ;
		int val  ; // Number printed in the current row
		
		// Rows
		int row = 1 ;
		while (row <= n) {
			
			val = row; // It sets the value that will be printed throughout the current row.
			
			// Spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			
			// Stars(Print Number)
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val);
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
