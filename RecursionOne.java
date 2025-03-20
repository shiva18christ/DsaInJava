import java.util.Scanner;

public class RecursionOne {
    public void printNumber(int n) {
        if (n == 11) {
            return;
        } else {
            System.out.println(n*14);
            printNumber(n + 1);
        }
    }

    public static void main(String[] args) {
        RecursionOne one = new RecursionOne();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to print");
        int n = input.nextInt();
        one.printNumber(n);


    }
}
