package Array;

public class Array00 {

	public static void main(String[] args) {

		// Declare
		int[] arr = null;
		System.out.println(arr);

		// Allocate Space
		arr = new int[5]; // new creates an array object in the heap memory.
		System.out.println(arr);

		// Get the Value
		// All elements of an int array are automatically initialized to 0.
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		// Set the Values
		// Stores values in the array.
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// Get the Value
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		// Print
		for (int i = 0; i < arr.length; i++) { // arr.length returns the size of the array (5).
			System.out.println(arr[i]);
		}

		// Enhanced for Loop
		for (int val : arr) { // val stores each element of the array one by one and no index is needed.
			System.out.println(val);
		}
		
		// Swap
		int i = 0, j = 2;
		// non working swap
		System.out.println(arr[i] + ", " + arr[j]);
		Swap(arr[i], arr[j]);
		System.out.println(arr[i] + ", " + arr[j]);
		
		// working swap
		System.out.println(arr[i] + ", " + arr[j]);
		Swap(arr, i, j);
		System.out.println(arr[i] + ", " + arr[j]);
		
		int[] other = { 100, 200, 300 };
		System.out.println(arr[0] + ", " + other[0]);
		Swap(arr, other);
		System.out.println(arr[0] + ", " + other[0]);
		
	}
	
	public static void Swap(int[] one, int[] two) {
		int[] temp = one;
		one = two;
		two = temp;
	}
	
	public static void Swap(int[] arr, int i, int j) {
		System.out.println(arr[i] + ", " + arr[j]);
	
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void Swap(int one, int two) {
		int temp = one;
		one = two;
		two = temp;
	}

 }
