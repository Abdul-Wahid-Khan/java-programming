package Recursion;

public class Print_BoardPath {

	public static void main(String[] args) {
		
		printBoardPath(0, 10, "");
		
	}
	
	public static void printBoardPath(int curr, int end, String ans) {
		
		// Base case
		if (curr == end) { // When the current position becomes equal to the destination, print the answer
			System.out.println(ans);
			return;
		}
		
		if (curr > end) { // If the current position crosses the destination, stop that recursive call
			return;
		}
		
		for (int dice = 1; dice <= 6; dice++){ // This loop tries all six possible dice values
			printBoardPath(curr + dice, end, ans + dice); // (curr + dice) moves to the next position and (ans + dice) adds the dice value to the answer
		}
	}

}
