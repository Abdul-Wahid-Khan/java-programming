package Recursion;

import java.util.ArrayList;

public class Get_Permutation {

	public static void main(String[] args) {
		
		System.out.println(getPermutation("abc"));

	}
	
	public static ArrayList<String> getPermutation(String str) {
		
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		
		char ch = str.charAt(0); // ch = Current character
		String ros = str.substring(1); // ros = Rest of string
		
		ArrayList<String> rr = getPermutation(ros); // This calls the same method with the remaining string
		
		ArrayList<String> mr = new ArrayList<>(); // mr stores the final permutations for the current string
		
		for (String rrs : rr) { // It takes each permutation returned by the recursive call, one by one
			
			for (int i = 0; i <= rrs.length(); i++) { // It inserts the current character at every possible position
				
				String val = rrs.substring(0, i) + ch + rrs.substring(i); // This divides the existing string into two parts and inserts ch between them
				mr.add(val);
			}
		}
		
		return mr;
	}

}
