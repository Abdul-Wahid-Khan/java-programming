package Recursion;

import java.util.ArrayList;

public class Recursion_Continued {

	public static void main(String[] args) {
		
		System.out.println(getSS("abc")); // getSS(Get SubSequences)
	}
	
	public static ArrayList<String> getSS(String str) {
		
		if (str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		
		char cc = str.charAt(0); // cc(Current Character)
		String ros = str.substring(1);
		ArrayList<String> myResult = new ArrayList<>(); // myResult stores the final subsequences for the current string
		ArrayList<String> recResult = getSS(ros); // recResult stores the subsequences returned by the recursive call for the remaining string
		for (int i = 0; i < recResult.size(); i++) {
			myResult.add(recResult.get(i));
			myResult.add(cc + recResult.get(i));
		}
		
		return myResult;
 	}

}
