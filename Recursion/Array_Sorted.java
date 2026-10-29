package Recursion;

public class Array_Sorted {

	public static void main(String[] args) {
		
		int[] arr = {3, 8, 6, 1, 9, 7};
		System.out.println(isSorted(arr, 0));
		
	}
	
	public static boolean isSorted(int[] arr, int si) {
		
		if(si == arr.length - 1) { // When si reaches the last index, all adjacent elements have been checked, so the array is sorted
			return true;
		}
		
		if(arr[si] > arr[si + 1]) { // If the current element is greater than the next element, the array is not sorted
			return false;
		} else {
			boolean restAns = isSorted(arr, si + 1); // If the current pair is in the correct order, the method checks the next pair by increasing the index
			return restAns;
		}
	}

}
