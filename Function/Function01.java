// This program converts a number from any base to its decimal equivalent.
package Function;

import java.util.Scanner;

public class Function01 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int snum = scn.nextInt(); // snum -> Source number
		int sb = scn.nextInt(); // sb -> Source base

		int result = AnybaseToDecimal(snum, sb); // Calls the function and stores the decimal value in result
		System.out.println(result);
		
		scn.close();
		
	}
	
	public static int AnybaseToDecimal(int snum, int sb) {
		
		int ans = 0; // ans stores the final decimal answer
		
		int multiplier = 1; // multiplier represents the place value
		
		while(snum != 0) {
			int rem = snum % 10;
			ans = ans + (rem * multiplier);
			
			multiplier = multiplier * sb;
			snum = snum / 10;
		}
		
		return ans;
	}

}
