// Linear Search
package Array;

import java.util.Scanner;

public class Array03 {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = TakeInput();

        System.out.print("Enter element to search: "); // Reads the element to search
        int item = scn.nextInt();

        int index = LinearSearch(arr, item); // Calls the searching method

        if (index == -1) { // If the returned index is -1, the element is not present
            System.out.println("Element not found");
        } else { // prints the index
            System.out.println("Element found at index " + index);
        }

        scn.close();
    }

    public static int[] TakeInput() {

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        return arr;
    }

    public static int LinearSearch(int[] arr, int item) {

        for (int i = 0; i < arr.length; i++) { // Checks each element one by one

            if (arr[i] == item) {
                return i; // Element found
            }
        }

        return -1; // Element not found
    }
}