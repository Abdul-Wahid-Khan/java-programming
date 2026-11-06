package Recursion;

import java.util.ArrayList;

public class Get_BoardPath {

	public static void main(String[] args) {
		
		System.out.println(getBoardPath(0, 10));

	}
	
	public static ArrayList<String> getBoardPath(int curr, int end) { // curr = current position / end = destination position
		
		if (curr == end) { // When curr == end we have reached the destination than we return an empty string because no more dice throws are needed
			ArrayList<String> br = new ArrayList<>();
			br.add("\n");
			return br;
		}
		
		if (curr > end) { // If the current position becomes greater than 10, that path is invalid. So we return an empty list
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		
		ArrayList<String> mr = new ArrayList<>();
		
		for (int dice = 1; dice <= 6; dice++) { // Try every dice value from 1 to 6
			ArrayList<String> rr = getBoardPath(curr + dice, end);
			
			for (String rrs : rr) {
				mr.add(dice + rrs);
			}
		}
		
		return mr;
		
	}

}
