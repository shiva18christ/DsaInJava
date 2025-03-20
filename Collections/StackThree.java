package Collections;

import java.util.Scanner;

public class StackThree {
    private int[] array;
    private int head;
    private int size;

    StackThree(int size) {
        this.array = new int[size];
        this.head = -1;
        this.size = size;
    }

    public void push(int element) {
        if (head == size - 1) {
            System.out.println("Stack overflow");
        }
        array[++head] = element;
    }

    public void pop() {
        if (head == -1) {
            System.out.println("Stack underflow");
        }
        head--;
    }

    public void peek() {
        if (head == -1) {
            System.out.println("Stack is empty");
        }
        System.out.println(array[head]);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of stack");
        int size = input.nextInt();
        StackThree stack = new StackThree(size);
        while (true) {
            System.out.println("1:Push");
            System.out.println("2:pop");
            System.out.println("3:peek");
            System.out.println("4:Exit");
            System.out.println("Enter your choice");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element you want to push in the stack");
                    int element = input.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    input.close();
                    return;
                default:
                    return;

            }


        }
    }
}
