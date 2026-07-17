// This Java program prints a vertical line of stars using a for loop.
package Patterns;

import java.util.Scanner; // Imports the Scanner class. Used to take input from the keyboard.

public class Pattern00 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in); // Creates a Scanner object named scn.
		int n = scn.nextInt(); // Reads an integer from the user.
		
		for (int row = 1 ; row <= n ; row++) { // This loop controls the number of rows.
			
			// Work 
			System.out.print("*"); // Prints one star.
			
			// Preparation
			System.out.println(); // Moves the cursor to the next line.
			
		}
		
		scn.close(); // Closes the Scanner after all input has been read.

	}

}
