import java.util.Arrays;

public class BubbleSort {
    private void bubbleSort(int[] arr) {
        try {
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < n - i; j++) {
                    if (arr[j - 1] > arr[j]) {
                        int temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                    }
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        int[] arr = {65, 3, 56, 78, 34, 99, 12};
        System.out.println("Original Array: " + Arrays.toString(arr));
        sort.bubbleSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

    }
}