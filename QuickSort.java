package dsa;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[] {7, 4, 11, 2, 88, 9, 2, 3};
        System.out.println("Array before QuickSort: " + Arrays.toString(arr));
        Quicksort(arr, 0, arr.length - 1);
        System.out.println("Array after QuickSort: " + Arrays.toString(arr));
    }

    private static void Quicksort(int[] arr, int l, int h) {
        if (l < h) {
            int pivot = partition(arr, l, h);
            Quicksort(arr, l, pivot - 1);
            Quicksort(arr, pivot + 1, h);
        }
    }

    private static int partition(int[] arr, int l, int h) {
        int pivot = arr[l];
        int i = l;
        int j = h;
        while (i < j) {
            while (i < h && arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, j, l);
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
