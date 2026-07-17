// This Java program prints a right-angled triangle star pattern using nested while loops.
package Patterns;

import java.util.Scanner;

public class Pattern03 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nst = 1 ; // nst stands for Number of Stars.
		// Rows
		int row = 1 ;
		while (row <= n) { // This loop controls the rows.
			
			// Work
			int cst = 1 ; // cst stands for Count of Stars.
			while (cst <= nst) { // This loop prints the stars for the current row.
				System.out.print("*"); // Prints one star.
		  		cst++; // Moves to the next star.
			}
			
			//Preparation
			System.out.println(); // After all stars in the current row are printed, move the cursor to the next line.
			nst = nst + 1 ; // It increases the number of stars for the next row.
			row = row + 1 ; // Moves to the next row.
		}
		scn.close();

	}

}
