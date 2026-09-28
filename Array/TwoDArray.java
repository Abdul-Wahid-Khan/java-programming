package Array;

public class TwoDArray {

	public static void main(String[] args) {
		
		// This creates a 3 * 3 matrix
		int[][] arr;
		arr = new int[3][3]; 
		
		display(arr);
		arr[0][0] = 10; // means 1st row, 1st column
		arr[2][0] = 20; // 2 = 3rd row and 0 = 1st column
		System.out.println("***************");
		display(arr);
	}
	
	public static void display(int[][] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
