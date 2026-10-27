package Recursion;

public class Factorial_Of_A_Number {

	public static void main(String[] args) {
		
		System.out.println(Fact(6));

	}
	
	public static int Fact(int n) {
		
		if (n == 1) { // When n becomes 1, the recursion stops and returns 1
			return 1;
		}
		
		int fnm1 = Fact(n - 1); // Calculates the factorial of the previous number
		int fn = n * fnm1; // Multiplies n by the factorial of n - 1 and returns the result
		return fn;
	}

}
