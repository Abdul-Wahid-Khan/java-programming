// This Java program takes a string as input from the user and prints each character on a separate line

package String;

import java.util.Scanner;

public class String_Operation {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine(); // reads the complete line, including spaces
		printChars(str); // Passes the input string to the printChars() method

		
		scn.close();
	}
	
	public static void printChars(String str) { // This method receives a string and prints its characters one by one
		
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i)); // {charAt(i)} retrieves the character at index i and {println()} prints it on a new line
		}
	}

	
}
