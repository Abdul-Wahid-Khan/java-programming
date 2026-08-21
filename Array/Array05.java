// Bubble Sort
package Array;

import java.util.Scanner;

public class Array05 {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = TakeInput();

        BubbleSort(arr); // Sorts the array

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

    public static void BubbleSort(int[] arr) {

        for (int count = 0; count < arr.length - 1; count++) {

            for (int j = 0; j < arr.length - 1 - count; j++) {

                if (arr[j] > arr[j + 1]) { // If the left element is larger, swap them

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void Display(int[] arr) {

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}