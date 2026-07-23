// This program converts a decimal number to any base
package Function;

import java.util.Scanner;

public class Function02 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int snum = scn.nextInt(); // snum -> Decimal (source) number
		int db = scn.nextInt(); // db -> Destination base
		
		
		int result = DecimalToAnybase(snum, db);
		System.out.println(result);
		
		scn.close();
		
	}
	
	public static int DecimalToAnybase(int snum, int db) {
		
		int ans = 0;
		
		int multiplier = 1;
		
		while(snum != 0) {
			int rem = snum % db;
			ans = ans + (rem * multiplier);
			
			multiplier = multiplier * 10;
			snum = snum / db;
		}
		
		return ans;
	}

}
