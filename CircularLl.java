
public class CircularLl {
    static Node head;
    static Node tail;

    static class Node {
        int data;
        Node next;
        Node previous;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    public void addFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = tail = node;
        }
        node.next = head;
        node.previous = tail;
        tail.next = node;
        head.previous = node;
        head = node;
    }

    public void addLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = tail = node;
        }
        node.previous = tail;
        tail.next = node;
        node.next = head;
        head.previous = node;
        tail = node;
    }

    public void displayForward() {
        Node node = head;
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        do {
            System.out.print(node.data + " ");
            node = node.next;
        }
        while (node != head);
        System.out.println(" ");
    }

    public void displayBackward() {
        Node node = tail;
        if (head == null) {
            System.out.println("The list is empty");
        }
        do {
            System.out.print(node.data + " ");
            node = node.previous;
        }
        while (node != tail);
        System.out.println(" ");
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
        }
        if (head == tail) {
            head = tail = null;
            return;
        }
            head = head.next;
            head.previous = tail;
            tail.next = head;

    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("the list is empty");
        }
        if (head == tail) {
            head = tail = null;
            return;
        }
        tail = tail.previous;
        tail.next = head;
        head.previous = tail;
    }


    public static void main(String[] args) {

        CircularLl list = new CircularLl();
        list.addFirst(5);
        list.addLast(10);
        list.addLast(15);
        list.displayForward();


    }
}
