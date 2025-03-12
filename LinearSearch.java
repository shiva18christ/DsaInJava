import java.util.Scanner;

public class LinearSearch {

    public int linearSearch(int[] array, int element) {
        if (array.length == 0) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinearSearch search = new LinearSearch();
        int[] arr = {10, 20, 30, 40, 50, 60};
        System.out.println("Enter the element you want to search");
        int element = input.nextInt();
        int result = search.linearSearch(arr, element);
        System.out.println(result);
    }
}
