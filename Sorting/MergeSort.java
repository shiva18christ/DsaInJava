package Sorting;

import java.util.Arrays;

public class MergeSort {
    public void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid  = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }

    }

    public void merge(int[] arr, int left, int mid, int right) {
        int n = mid - left+1;
        int m = right - mid;
        int[] leftArray = new int[n];
        int[] rightArray = new int[m];
        for(int i = 0; i < n; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < m; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = left;
        while (i < n && j < m) {
            if (leftArray[i] < rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < m) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
        MergeSort sort = new MergeSort();
        int[] arr = {15, 12, 17, 13, 95, 19};
        System.out.println("Original array:" + Arrays.toString(arr));
        sort.mergeSort(arr, 0, 5);
        System.out.println("Sorted array" + Arrays.toString(arr));

    }

}
