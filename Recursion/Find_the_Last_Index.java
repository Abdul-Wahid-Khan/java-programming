package Recursion;

public class Find_the_Last_Index {

	public static void main(String[] args) {
		
		int[] arr = {3, 8, 1, 8, 8, 7};
		System.out.println(lastIndex(arr, 0, 8));
		
	}
	
	public static int lastIndex(int[] arr, int si, int data) {
		
		if(si == arr.length) { // When the end of the array is reached, return -1 to indicate that no match has been found beyond that point
			return -1;
		}
		
		int index = lastIndex(arr, si+1, data); // The method searches the remaining array first, before checking the current element
		if(index == -1) {
			if(arr[si] == data) {
				return si;
			} else {
				return -1;
			}
		} else {
			return index;
		}
	}

}
