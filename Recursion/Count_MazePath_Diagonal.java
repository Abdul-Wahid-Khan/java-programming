package Recursion;

public class Count_MazePath_Diagonal {

	public static void main(String[] args) {
		
		System.out.println(countMazePathDiag(0, 0, 2, 2));

	}
	
	public static int countMazePathDiag(int cr, int cc, int er, int ec) {
		
		if (cr == er && cc == ec) {
			return 1;
		}
		
		if (cr > er || cc > ec) {
			return 0;
		}
		
		int ch = countMazePathDiag(cr, cc + 1, er, ec);
		int cv = countMazePathDiag(cr + 1, cc, er, ec);
		int cd = countMazePathDiag(cr + 1, cc + 1, er, ec);
		
		return ch + cv + cd;
	}

}
