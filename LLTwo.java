import java.util.Scanner;

class NodeOne {
    int data;
    NodeOne previous;
    NodeOne next;

    NodeOne(int element) {
        this.data = element;
        this.next = null;
        this.previous = null;
    }

}

public class LLTwo {
    NodeOne head;
    NodeOne tail;

    public void addFirst(int element) {
        NodeOne node = new NodeOne(element);
        if (head == null) {
            head = tail = node;
            return;

        }
        node.next = head;
        head.previous = node;
        head = node;
        head.previous = null;
    }

    public void addLast(int element) {
        NodeOne node = new NodeOne(element);
        if (head == null) {
            head = tail = node;
            return;
        }
        tail.next = node;
        node.previous = tail;
        tail = node;
        tail.next = null;
    }

    public void displayForward() {
        NodeOne node = head;
        if (head == null) {
            System.out.println("List is empty");
        }
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }

    }

    public void displayBackward() {
        NodeOne node = tail;
        if (tail == null) {
            System.out.println("List is empty");
        }
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.previous;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
        }
        tail = tail.previous;
    }

    public static void main(String[] args) {
        LLTwo list = new LLTwo();

        Scanner input = new Scanner(System.in);
        System.out.println("1:Add first");
        System.out.println("2:Add last");
        System.out.println("3:delete first");
        System.out.println("4:delete last");
        System.out.println("5:Display first");
        System.out.println("6: Display last");
        System.out.println("7:Exit");
        System.out.println("Please enter your choice");
        while (true) {
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please enter the element you want to add");
                    int element = input.nextInt();
                    list.addFirst(element);
                    break;
                case 2:
                    System.out.println("Please enter the element you want to add");
                    int last = input.nextInt();
                    list.addLast(last);
                    break;
                case 3:
                    list.deleteFirst();
                    break;
                case 4:
                    list.deleteLast();
                    break;
                case 5:
                    list.displayForward();
                    break;
                case 6:
                    list.displayBackward();
                    break;
                case 7:
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice ");
                    return;

            }

        }

    }
}

