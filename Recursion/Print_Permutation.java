package Recursion;

public class Print_Permutation {

	public static void main(String[] args) {
		
		printPermutation("abc", "");

	}
	
	public static void printPermutation(String ques, String ans) {
		
		// Base case
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		for (int i = 0; i < ques.length(); i++) { // This loop selects every character of ques, one by one
			
			char ch = ques.charAt(i); // Select a character
			String roq = ques.substring(0, i) + ques.substring(i + 1); // It removes the selected character from the original string
			
			printPermutation(roq, ans + ch);
		}
	}

}
