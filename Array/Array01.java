// This program demonstrates how to take an array as input and display it using functions (methods)
package Array;

import java.util.Scanner;

public class Array01 {

	// 'static' allows all static methods (main(), TakeInput(), Display()) to use
	// the same scanner
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[] array = takeInput(); // Calls TakeInput() to create and fill the array

		display(array); // Passes the array to Display() to print it

	}

	public static int[] takeInput() {

		System.out.println("Size ?");
		int n = scn.nextInt();

		int[] arr = new int[n]; // Creates an array of size n

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the value for " + i + " index ?");
			arr[i] = scn.nextInt();
		}

		return arr; // Returns the array reference to main()
	}

	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
