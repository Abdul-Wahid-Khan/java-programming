// This program demonstrates several important Java concepts: functions, parameters, return values, variable scope, global variables, block scope, and pass by value.
package Function;

public class Function00 {

	public static int val = 20; // 'val' is a global (class) variable because it is declared inside the class but outside all methods. It can be accessed by every method in the class.
	
	public static void main(String[] args) {
		
		// Part 1 : Normal Call
		System.out.println("Part 1 : Normal Call");
		
		System.out.println("Hello");
		
		// Function Call
		addition();

		System.out.println("Bye");
		
		// Part 2 : Function with Parameters
		System.out.println("Part 2 : Function with Parameters");
		// Here the values are passed to the function.
		additionParams(10, 20); // 10 and 20 are arguments and they are the actual values passed to the function.
		additionParams(20, 30); // Again Arguments
		
		// Part 3 : Function Return Value
		System.out.println("Part 3 : Function Return Value");
		int sum = additionReturn(30, 40); // The returned value (70) is assigned to the variable sum.
		System.out.println(sum);
		
		// Part 4 : Variable Scope
		System.out.println("Part 4 : Variable Scope"); // Variable scope is the area of the program where a variable can be accessed.
		int one = 10;
		int two = 20;
		int result = DemoScopes(one, two);
		System.out.println(result);
		
		// Part 5 : Global Scope
		System.out.println("Part 5 : Global Scope");
		System.out.println(val);
		int val = 200;
		System.out.println(val);
		System.out.println(Function00.val);
		int ans = DemoGlobalScopes(one);
		System.out.println(ans);
		
		// Part 6 : Block Scope
		System.out.println("Part 6 : Block Scope");
		if (one < two) {
			int three = 30; // three exists only inside the if block. This is invalid outside the block because three is out of scope.
			System.out.println(three);
		}
		
		// Part 7 : Pass By Value
		System.out.println("Part  : Pass By Value");
		System.out.println(one + ", " + two);
		Swap(one, two); // They are swapped only inside the function.
		System.out.println(one + ", " + two);
	}
	
	// Functions Definition
	
	// Pass By Value
	public static void Swap(int one, int two) {
		System.out.println(one + ", " + two);
		int temp = one;
		one = two;
		two = temp;
	}
	
	// Global Scope
	public static int DemoGlobalScopes(int one) {
		int sum = one + val;
		return sum;
	}
	
	// Variable Scope
	public static int DemoScopes(int one, int another) { // This one and another are Local Variable of DemoScopes.
		int sum = one + another;
		return sum;
	}
	
	// Function Return Value
	public static int additionReturn(int a, int b) {
		int sum = a + b;
		return sum; // Returns the value of sum to the method that called it.
	}
	
	// Function with Parameters
	public static void additionParams(int a, int b) { // a and b are parameters and they receive values from the function call.
		int sum = a + b;
		System.out.println(sum);
	}
	
	// Normal Call
	public static void addition() {
		int a = 5;
		int b = 10; 
		int c = a + b;
		System.out.println(c);
	}

}
