// This Java program prints a centered number pyramid using consecutive numbers. Unlike the previous patterns, the numbers do not repeat and do not restart in each row—they continue increasing throughout the pattern.
package Patterns;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nst = 1 ;
		int nsp = n - 1 ;
		int val = 1 ;
		
		// Rows
		int row = 1 ;
		while (row <= n) {
			
			
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t"); // Here, \t means tab. It creates equal spacing before the numbers.
			}
			
			// Print Number
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val + "\t"); // Every time a number is printed: Print the current value of val and Increase val by 1.
				val++;  
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
// \t prints a tab, which is wider than a single space. It helps align multi-digit numbers (like 10, 11, 12) better than using one space.