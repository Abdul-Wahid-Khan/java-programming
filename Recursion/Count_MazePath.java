package Recursion;

public class Count_MazePath {

	public static void main(String[] args) {
		
		System.out.println(countMazePath(0, 0, 2, 2));

	}
	

	public static int countMazePath(int cr, int cc, int er, int ec) {
		
		if (cr == er && cc == ec) { // When we reach the destination, return 1 because we found one valid path
			return 1;
		}
		
		if (cr > er || cc > ec) { // If we move outside the maze, return 0 because no valid path exists
			return 0;
		}
		
		int ch = countMazePath(cr, cc + 1, er, ec);
		int cv = countMazePath(cr + 1, cc, er, ec);
		
		return ch + cv; // Add both counts to get the total number of paths
	}

}
