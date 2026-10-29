package Recursion;

public class Find_the_First_Index {

	public static void main(String[] args) {
		
		int[] arr = { 6, 8, 1, 1, 8, 3, 4 };
		System.out.println(firstIndex(arr, 0, 7));

	}
	
	public static int firstIndex(int[] arr, int si, int data) {
		
		if(si == arr.length) { // If the search reaches the end of the array without finding the element, return -1
			return -1;
		}
		
		if(arr[si] == data) { // If the current element matches the target, return its index immediately
			return si;
		} else {
			int restAns = firstIndex(arr, si + 1, data); // If the element does not match, search the remaining array by moving to the next index
			return restAns;
		}
	}

}
