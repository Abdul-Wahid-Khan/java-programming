package Array;

import java.util.Scanner;

public class Two_D_Array {

    public static void main(String[] args) {
        int[][] arr = takeInput();
        display(arr);
    }

    private static int[][] takeInput() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int rows = s.nextInt();

        int[][] arr = new int[rows][];

        for (int row = 0; row < rows; row++) {

            System.out.print("Enter the number of cols for row " + row);
            int cols = s.nextInt();

            arr[row] = new int[cols];

            for (int col = 0; col < cols; col++) {
                System.out.println("Enter the value for row " + row + " and col " + col);
                arr[row][col] = s.nextInt();
            }
        }

        s.close();   // Close Scanner
        return arr;
    }

    private static void display(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}