package Recursion;

public class Recursion_Demo {

	public static void main(String[] args) {
		PD(5); // PD(Print Decreasing)
		PI(5); // PI(Print Increasing)
		PDI(5); // PDI(Print Decreasing and Increasing)
		PDISkip(5);
	}
	
	// Print Decreasing
	public static void PD(int n) {
		if(n == 0) {
			return;
		}
		System.out.println(n);
		PD(n - 1);
		
	}
	
	// Print Increasing
	public static void PI(int m) {
		if(m == 0) {
			return;
		}
		PI(m - 1);
		System.out.println(m);

	}
	
	// Print Decreasing and Increasing
	public static void PDI(int u) {
		if(u == 0) {
			return;
		}
		System.out.println(u); // // Print decreasing
		PDI(u - 1); // // Recursive call
		System.out.println(u); // // Print increasing
	}
	
	// prints odd numbers while recursion goes down and even numbers while recursion returns
	public static void PDISkip(int e) {
		if(e == 0) {
			return;
		}
		if(e % 2 == 1) { // If e is odd, it prints the number before making the recursive call
			System.out.println(e);
		}
		PDISkip(e - 1); // Recursive call
		if(e % 2 == 0) { // If e is even, it prints the number when the recursive call returns
			System.out.println(e);
		}
		
	}
	
}
