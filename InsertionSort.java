import java.util.Arrays;

public class InsertionSort {
    public void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }

    }

    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        int[] array = {22, 66, 23, 67, 12, 4, 89, 43};
        System.out.println("Original array :" + Arrays.toString(array));
        sort.insertionSort(array);
        System.out.println("Sorted array :" + Arrays.toString(array));

    }
}
