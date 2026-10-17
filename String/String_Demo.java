package String;

public class String_Demo {

	public static void main(String[] args) {
		
		String str = "Bye";
		str = "Hello";
		System.out.println(str);
		
		// chatAt() Function
		System.out.println(str.charAt(0)); // Character at index 0
		System.out.println(str.charAt(1)); // Character at index 1
		System.out.println(str.charAt(2)); // Character at index 2

		// length() Function
		System.out.println(str.length());
		
		// substring() Function
		System.out.println(str.substring(1,4)); // Characters from index 1 to 3
		System.out.println(str.substring(2,5));
		System.out.println(str.substring(3)); // Characters from index 3 to the end
		
		// concatenate : Joins two strings
		String s1 = "Hi";
		String s2 = " Bye";
		String s3 = s1 + s2;
		System.out.println(s3);
		String s4 = s1.concat(s2);
		System.out.println(s4);
		
		// indexOf() Method : this is used to find the index (position) of a character or substring in a string.
		System.out.println(str.indexOf("el"));
		System.out.println(str.indexOf("El"));
		
		// starsWith() Method : this checks whether a string starts with a particular character sequence. It returns true or false
		System.out.println(str.startsWith("he"));
		System.out.println(str.startsWith("He"));
		
		s1 = "Hello";
		s2 = s1;
		s3 = "Hello";
		s4 = new String("Hello");
		
		// == compares object references (whether they refer to the same object) and {.equals()} compares string contents
		System.out.println((s1 == s2) + ", " + s1.equals(s2));
		System.out.println((s1 == s3) + ", " + s1.equals(s3));
		System.out.println((s1 == s4) + ", " + s1.equals(s4));
	}

}
