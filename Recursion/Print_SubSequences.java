package Recursion;

import java.util.ArrayList;

public class Print_SubSequences {

	public static void main(String[] args) {
		
		System.out.println(getSS("abc"));
		printSS("abc", "");

	}
	
	public static ArrayList<String> getSS(String str) { // This method returns an ArrayList containing all subsequences
		
		// Base case
		if (str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		
		// Divide the string
		char cc = str.charAt(0);
		String ros = str.substring(1);
		
		// Create result lists
		ArrayList<String> myResult = new ArrayList<>();
		ArrayList<String> recResult = getSS(ros);
		
		// Loop through recursive results
		for (int i = 0; i < recResult.size(); i++) {
			myResult.add(recResult.get(i));
			myResult.add(cc + recResult.get(i));
		}
		
		// Return the result
		return myResult;
 	}
	
	public static void printSS(String str, String result) { // This method directly prints all subsequences
		
		// Base case
		if (str.length() == 0) { // When no characters are left, print the current result and return
			System.out.println(result);
			return;
		}
		
		// Divide the strin
		char cc = str.charAt(0);
		String ros = str.substring(1);
		
		printSS(ros, result); // First recursive call
		printSS(ros, result + cc); // Second recursive cal
		}

}
