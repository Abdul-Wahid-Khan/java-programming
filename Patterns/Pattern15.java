// This Java program prints a diamond-shaped pattern made of numbers and stars (*). The numbers increase to the middle row and then decrease, while the width of the pattern first increases and then decreases.
package Patterns;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nr = 2 * n - 1;
		int nst = 1 ;
		int val ;
		// Row
		int row = 1 ;
		while (row <= nr) {
			
			// This creates the sequence: So the numbers increase and then decrease.
			if (row <= n)
				val = row ;
			else 
				val = nr - row + 1;
			
			
			// Work
			int cst = 1;
			while(cst <= nst) {
				if(cst % 2 == 0) {
					System.out.print(" ");
				} else {
					System.out.print(val);
				}
				System.out.print("*");
				cst++;
			}
			
			// Preparation
			System.out.println();
			if (row <= nr / 2) {
				nst += 2;
			} else {
				nst -= 2;
			}
			row++;
		}
		
		scn.close();

	}

}
