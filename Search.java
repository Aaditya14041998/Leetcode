package dsa;

import java.util.Arrays;

public class Search {

	
	public static void main(String[] args) {
		int[] arr = {88, 33, 66, 99, 44, 77, 22, 55, 11};
		Arrays.sort(arr);
		int key = 77;
		
		
//	int resultIndex = linarSearch(arr,key);
//	System.out.println("element fount at index :"+resultIndex);
	
	
	int resultIndex1 = binarySearch(arr,key);
	System.out.println("element fount at index :"+resultIndex1);
	}

	public static int binarySearch(int[] arr, int key) {
		int left = 0;
		int right = arr.length-1;
		int mid;
		
		while (left <= right) {
	        mid = (left + right) / 2;
	        if (key == arr[mid]) {
	            return mid;
	        }
	        if (key < arr[mid]) {
	            right = mid - 1;
	        } else {
	            left = mid + 1;
	        }
	    }
	    return -1;
	}
	
	
	private static int linarSearch(int[] arr, int key) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
		
	}
}
