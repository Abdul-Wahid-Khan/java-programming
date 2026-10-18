package String;

public class String_Performance {

	public static void main(String[] args) {

		long start = System.currentTimeMillis(); // Gets the current time in milliseconds before the operation
		appendStringBuilder(100000); // Calls appendString() to concatenate numbers from 1 to 100000
		long end = System.currentTimeMillis(); // Gets the time after the method finishes

		System.out.println(end - start); // Prints the elapsed time in milliseconds
	}

	public static void appendString(int n) {

		String s = "";

		for (int i = 1; i <= n; i++) {
			s = s + i;
		}
	}
	
	public static void appendStringBuilder(int n) {

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= n; i++) {
			sb.append(i);
		}
	}

}
