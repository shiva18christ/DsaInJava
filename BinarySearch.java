import java.util.Scanner;

public class BinarySearch {
    public int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] < target) {
               start=mid+1;
            } else if (array[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BinarySearch search = new BinarySearch();
        int[] array = {10, 20, 30, 40, 50, 60};
        System.out.println("Enter the element you want to search in the array");
        int target = input.nextInt();
        int result = search.binarySearch(array, target);
        System.out.println("your target element is at the position " + result);

    }


}
