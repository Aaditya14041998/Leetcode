package dsa;

import java.util.Arrays;

public class selectionSort 
{

	public static void main(String[] args) 
	{
		int []arr = new int[] {1,4,7,8,5,2,3,6,9};
		System.out.println("array before selection sort: "+ Arrays.toString(arr));
	       selectionSort(arr);
	       System.out.println("array after selection sort: "+ Arrays.toString(arr));
	}

	private static void selectionSort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]>arr[j]) 
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}

}
