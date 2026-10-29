package Recursion;

public class Nth_Fibonacci {

	public static void main(String[] args) {
		
		System.out.println(fib(4));

	}
	
	public static int fib(int n) {
		
		if(n == 1 || n == 0) {
			return n;
		}
		
		int fnm1 = fib(n - 1); // The calculates the previous two Fibonacci numbers
		int fnm2 = fib(n - 2);
		int fn = fnm1 + fnm2; // Adds the two results and returns their sum
		return fn; 
	}

}
