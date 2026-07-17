// This Java program also prints a vertical line of * (stars) using a while loop.
package Patterns;

import java.util.Scanner;

public class Pattern01 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int row = 1 ; // Row keeps track of how many rows have been printed.
		while (row <= n) { // The loop runs as long as row is less than or equal to n.
			
			// Work 
			System.out.print("*");
			
			// Preparation
			System.out.println();
			row = row + 1 ; // Increases the row count by 1.
			
		}
		
		scn.close();

	}

}
