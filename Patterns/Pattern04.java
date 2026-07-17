// This Java program prints an inverted right-angled triangle using nested while loops.
package Patterns;

import java.util.Scanner;

public class Pattern04 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nst = n ;
		// Rows
		int row = 1 ;
		while (row <= n) {
			
			// Work
			int cst = 1 ;
			while (cst <= nst) { // This loop prints the required number of stars in the current row.
				System.out.print("*");
		  		cst++;
			}
		  	
			//Preparation
			System.out.println();
			nst = nst - 1 ; // It decreases the number of stars for the next row.
			row = row + 1 ;
		}
		scn.close();


	}

}
