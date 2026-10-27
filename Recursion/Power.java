package Recursion;

public class Power {

	public static void main(String[] args) {
		
		System.out.println(power(2, 5));
	}
	
	public static int power(int x, int n) {
		
		if (n == 0) { // Any non-zero number raised to the power zero equals 1
			return 1;
		}
		
		int pnm1 = power(x, n - 1);
		int pn = x * pnm1; // Multiply x by the result of the previous recursive call
		return pn;
	}

}
