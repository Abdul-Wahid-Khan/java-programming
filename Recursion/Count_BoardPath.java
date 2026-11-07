package Recursion;

public class Count_BoardPath {

	public static void main(String[] args) {
		
		int c = countBoardPath(0, 10);
		System.out.println(c);
		
	}
	
	public static int countBoardPath(int curr, int end) {
		
		// Base case
		if (curr == end) { // When we reach the destination, return 1
			return 1;
		}
		
		if (curr > end) { // If we cross the destination, that path is invalid
			return 0;
		}
		
		int count = 0;
		for (int dice = 1; dice <= 6; dice++){
			count += countBoardPath(curr + dice, end);
		}
		
		return count;
	}

}
