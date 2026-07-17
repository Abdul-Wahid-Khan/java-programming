package Data_Types;

public class DataType00 {

	public static void main(String[] args) {
		
		byte b = 10; // Size : 1 byte (8 bits), Range : -128 to 127
		short sh = 20; // Size : 2 bytes (16 bits)
		int in = 30; // Size : 4 bytes (32 bits)
		long ln = 40; // Size : 8 bytes (64 bits)
		
		//b = sh; -> Error because a short may not fit into a byte.
		//b = in;
		//b = ln;
		  
		sh = b; // byte  → short
		//sh = in;
		//sh = ln;
		
		in = b; // byte → int
		in = sh; // short → int
		//in = ln;
		
		ln = b;
		ln = sh;
		ln = in;
		
		//Part 2
		
		b = 10; // Valid
		b = 127; // Also valid because 127 is the maximum value for a byte.
		b = (byte) 128; // This is explicit type casting.
		System.out.println(b);
		
		//Part 3
		
		in = 1000000000; // Valid
		//in = 10000000000; // This causes an error because is larger than the maximum int value.
		ln = 10000000000L; // Notice the L. The suffix L tells Java:"Treat this number as a long."
		System.out.println(ln);
		
		//Part 4
		
		sh = 32000; // Valid because: 32000 is within this range.
		
		//Part 5
		
		// float f = 5.5;
		float f = 5.5f;
		System.out.println(f);
		
		double db = 6.5; // Valid because decimal values are double by default.
		
		//Part 6
		
		in = (int) f;
		System.out.println(in);
		
		f = in;
		System.out.println(f);
		
		//Part 7
		
		boolean bit = true;
		//bit = 1; These are invalid: Unlike C/C++, Java does not allow integers as booleans.
		//bit = 0;
		
		if (bit) {
			System.out.println("Hello");
		} else {
			System.out.println("Bye");
		}
		
		bit = false;
		if (bit) {
			System.out.println("Hello");
		} else {
			System.out.println("Bye");
		}
		
		if (in > 0) {
			System.out.println("Greater");
		} else {
			System.out.println("Lesser or Equal");
		}
		
		//Part 8
		
		// Character
		char ch = 'a'; // Character stores a Unicode value.
		ch = 99; // ASCII / Unicode : 99 = c
		System.out.println(ch);
		
		//ch = 64000;
		//System.out.println(ch);
		
		// ch = ch +2;
		ch = (char) (ch + 2);
		System.out.println(ch);
		
		in = ch;
		System.out.println(in);
		
		//ch = 68000; -> Character values are stored in 16 bits (char range: 0 to 65535).
		ch = (char) 68000; // (char)68000 prints ঠ because Java char is 16 bits, so 68000 wraps around to Unicode value 2464 (68000 % 65536), and Unicode character 2464 is ঠ.
		System.out.println(ch);
		
		//Part 9
		
		System.out.println(10 + 20 + "Hello" + 10 + 20); // Output : 30Hello1020
		System.out.println(2 + ' ' + 5); // Output : 39
		System.out.println(2 + " " + 5); // Output : 2 5
		System.out.println("Hello" + '\t' + "World"); // Output : Hello    World
		System.out.println("Hello" + "\t" + "World"); // Output : Hello    World
		
	}

}

