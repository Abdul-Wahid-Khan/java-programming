package String;

import java.util.Scanner;

public class Print_All_Substrings {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine(); 
		printsubString(str);

		
		scn.close();
	}
	
	public static void printsubString(String str) { 
		
		for(int si = 0; si <= str.length() - 1; si++) { // si = starting index of the substring
			
			for(int ei = si + 1; ei <= str.length(); ei++) { // ei = ending index of the substring (exclusive)
				
				String subString = str.substring(si ,ei);
				System.out.println(subString);
				
			}
		}
	}

}

