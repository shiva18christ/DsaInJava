package Sorting;

import java.util.Arrays;

public class MergeSortedArrays {
    public int[] merge(int[] leftArr, int[] rightArr) {
        int[] mergedArray = new int[leftArr.length + rightArr.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] < rightArr[j]) {
                mergedArray[k] = leftArr[i];
                i++;
            } else {
                mergedArray[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < leftArr.length) {
            mergedArray[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightArr.length) {
            mergedArray[k] = rightArr[j];
            j++;
            k++;
        }
        return mergedArray;

    }

    public static void main(String[] args) {
        MergeSortedArrays sort = new MergeSortedArrays();
        int[] rightArray = {1, 3, 5, 7, 9};
        int[] leftArray = {2, 4, 6, 8, 10};
        System.out.println(Arrays.toString(sort.merge(leftArray, rightArray)));
    }
}
