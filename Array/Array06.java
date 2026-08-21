// Selection Sort
package Array;

import java.util.Scanner;

public class Array06 {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arr = TakeInput(); // Reads the array

		SelectionSort(arr); // Sorts the array

		System.out.println("Sorted Array:");
		Display(arr); // Prints the sorted array

		scn.close();
	}

	public static int[] TakeInput() {

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		return arr;
	}

	public static void SelectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			int min = i; // Minimum

			for (int j = i + 1; j < arr.length; j++) { // Starts from the next element and searches for a smaller value

				if (arr[j] < arr[min]) { // If a smaller element is found, update min
					min = j;
				}
			}

			// Swap the first unsorted element with the smallest element
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}

	public static void Display(int[] arr) {

		for (int val : arr) {
			System.out.print(val + " ");
		}
	}
}
