package dsa;

import java.util.Arrays;

public class insertion {

	public static void main(String[] args) {
		int []arr = new int[] {7,4,11,2,88,9,2,3};
		System.out.println("array before insertion sort: "+ Arrays.toString(arr));
	       insertion(arr);
	       System.out.println("array after insertion sort: "+ Arrays.toString(arr));

	}

	private static void insertion(int[] arr) {
		int n = arr.length;
		
		for(int i=1;i<n;i++) {
			int key = arr[i];
			int j = i - 1;
			while(j>=0 && key<arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		
	}

}
