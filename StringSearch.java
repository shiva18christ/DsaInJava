import java.util.Scanner;

public class StringSearch {
    public int search(String name, char letter) {
        if (name.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < name.length(); i++) {
            if (letter == name.charAt(i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringSearch search = new StringSearch();
        System.out.println("Enter the name");
        String name = input.nextLine();
        System.out.println("Enter the letter you want to search in name");
        char letter = input.next().charAt(0);
        int result = search.search(name, letter);
        System.out.println("The letter " + letter + " is at index " + result);
    }
}
