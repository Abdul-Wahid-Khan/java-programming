package Recursion;

public class Tower_Of_Hanoi {

	public static void main(String[] args) {
		
		int n = 3;
		
		toh(n, "src", "dest", "helper");

	}
	
	public static void toh(int n, String src, String dest, String helper) {
		
		if (n == 0) { // When no disks are left, stop the recursion
			return;
		}
		
		toh(n - 1, src, helper, dest); // Move the top n-1 disks from source to helper using destination
		
		System.out.println("move " + n + "th disc from " + src + " to " + dest); // Move the largest disk from source to destination
		
		toh(n - 1, helper, dest, src); // Move the remaining n-1 disks from helper to destination
	}

}
