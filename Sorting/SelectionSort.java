package Sorting;

import java.util.Arrays;

public class SelectionSort {
    private void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int maxIndex = getMax(arr, 0, last);
            swap(arr, maxIndex, last);
        }

    }

    private int getMax(int[] arr, int start, int end) {
        int maxIndex = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        int[] arr = {76, 97, 54, 66, 86};
        System.out.println("Original array:" + Arrays.toString(arr));
        sort.selectionSort(arr);
        System.out.println("Sorted array:" + Arrays.toString(arr));
    }
}