package Recursion;

public class Print_MazePath_Diagonal {

	public static void main(String[] args) {
		
		printMazePathDiag(0, 0, 2, 2, "");

	}
	
	public static void printMazePathDiag(int cr, int cc, int er, int ec, String ans) {
		
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		
		if (cr > er || cc > ec) {
			return;
		}
		
		printMazePathDiag(cr, cc + 1, er, ec, ans + "H");
		printMazePathDiag(cr + 1, cc, er, ec, ans + "V");
		printMazePathDiag(cr + 1, cc + 1, er, ec, ans + "D");
	}

}
