package dsa;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
		
		int []arr = new int[] {1,4,7,8,5,2,3,6,9};
		System.out.println("array before bubble sort: "+ Arrays.toString(arr));
	       bubbleSort(arr);
	       System.out.println("array after bubble sort: "+ Arrays.toString(arr));
	}

	private static void bubbleSort(int[] arr) {
		
	 for(int i=0;i<arr.length-1;i++) {
		 for(int j=0;j<arr.length-1;j++) {
			 if(arr[j]>arr[j+1]) {
				 int temp = arr[j];
				 arr[j]=arr[j+1];
				 arr[j+1]=temp;
			 }
		 }
	 }
		
	}

}
