package Recursion;

public class Bubble_Sort {

    public static void main(String[] args) {

        int[] arr = {50, 40, 30, 20, 10};

        bubbleSort(arr, 0, arr.length - 1);

        display(arr);
    }

    public static void bubbleSort(int[] arr, int si, int li) {

        // Base case
        if (li == 0) {
            return;
        }

        // One pass completed
        if (si == li) {
            bubbleSort(arr, 0, li - 1);
            return;
        }

        // Compare and swap
        if (arr[si] > arr[si + 1]) {

            int temp = arr[si];
            arr[si] = arr[si + 1];
            arr[si + 1] = temp;
        }

        // Next comparison
        bubbleSort(arr, si + 1, li);
    }

    public static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
