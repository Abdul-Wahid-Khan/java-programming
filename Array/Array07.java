// Insertion Sort
package Array;

import java.util.Scanner;

public class Array07 {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = TakeInput();

        InsertionSort(arr); // Sorts the array

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

    public static void InsertionSort(int[] arr) {

        for (int count = 1; count < arr.length; count++) { // Starts from index 1 because the first element is already considered sorted

            int temp = arr[count]; // Stores the current element that needs to be inserted
            int j = count - 1; // Starts checking from the previous element

            while (j >= 0 && arr[j] > temp) { // Shift Larger Elements
                arr[j + 1] = arr[j]; // Moves the larger element one position to the right
                j--;
            }

            arr[j + 1] = temp; // Places temp into its correct position
        }
    }

    public static void Display(int[] arr) {

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}