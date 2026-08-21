// Binary Search
package Array;

import java.util.Scanner;

public class Array04 {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = TakeInput(); // Reads the sorted array

        System.out.print("Enter element to search: ");
        int item = scn.nextInt(); // Reads the element to search

        int index = BinarySearch(arr, item); // Calls the Binary Search

        if (index == -1) {
            System.out.println("Element not found");
        } else {
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

    public static int BinarySearch(int[] arr, int item) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) { // Continue searching while the search range is valid

            int mid = (low + high) / 2;

            if (arr[mid] == item) {
                return mid;
            } 
            else if (item > arr[mid]) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return -1; // If low > high, the element does not exist
    }
}