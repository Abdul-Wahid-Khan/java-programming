package String;

public class String_Builder_Demo {

	public static void main(String[] args) {
		
		String str = "Hello";
		
		StringBuilder sb =  new StringBuilder(str);
		System.out.println(sb);
		System.out.println(sb.length());
		
		// append()
		sb.append("abc");
		System.out.println(sb);
		
		// insert()
		sb.insert(2,  "def");
		System.out.println(sb);
		
		sb.insert(2, 'g');
		System.out.println(sb);

		// delete
		sb.deleteCharAt(2);
		System.out.println(sb);
		
		// update
		sb.setCharAt(4, 'd');
		System.out.println(sb);
		
		// Ranges
		sb.insert(sb.length(), 'i');
		System.out.println(sb);
		
		// StringBuilder to String
		String s = sb.toString();
		System.out.println(s);
	}

}
