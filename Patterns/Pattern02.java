// This Java program prints a square(like 4 *4) star (*) pattern using nested while loops.
package Patterns;

import java.util.Scanner;

public class Pattern02 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int row = 1 ;
		while (row <= n) { // The outer loop controls the rows.
			
			// Work 
			int column = 1 ;
			while (column <= n) { // The inner loop controls the columns (how many stars are printed in each row).
				System.out.print("*"); // Each time the inner loop runs, one * is printed.
				column = column + 1 ; // This moves to the next column.
			}
			 
			// Preparation
			System.out.println();
			row = row + 1 ;
			
		} 
		
		scn.close();


	}

}
