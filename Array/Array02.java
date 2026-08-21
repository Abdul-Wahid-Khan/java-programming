// This program finds the maximum element in an array
package Array;

import java.util.Scanner;

public class Array02 {

	// static allows all static methods to use the same scanner
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = TakeInput(); // Calls the TakeInput() and stores the returned array

        int max = Max(arr); // Calls the Max() to find the largest element

        System.out.println("Maximum element = " + max);

        scn.close();
    }

    public static int[] TakeInput() {

        int n = scn.nextInt();

        int[] arr = new int[n]; 

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        return arr; // Returns the array reference to main()
    }

    public static int Max(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) { // Starts from index 1 because index 0 is already stored in max
            // If the current element is larger, update max
        	if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}