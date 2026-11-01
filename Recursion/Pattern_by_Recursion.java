package Recursion;

public class Pattern_by_Recursion {

	public static void main(String[] args) {
		
		pattern(5, 1, 1);

	}
	
	public static void pattern(int N, int row, int col) {
		
		if(row > N) { // Stops the program after printing all 5 rows
			return;
		}
		
		if(col > row) { // When the current row has enough stars, it prints a newline and starts the next row at column 1
			System.out.println();
			pattern(N, row+1, 1);
			return;
		}
		
		System.out.print("*\t"); // Prints one star and recursively moves to the next column
		pattern(N, row, col+1);
	}

}
