import java.util.Scanner;

public class QueueTwo {
    private int[] array;
    private int capacity;
    private int front;
    private int rear;

    public QueueTwo(int capacity) {
        this.capacity = capacity;
        this.rear = -1;
        this.front = 0;
        this.array = new int[capacity];
    }

    public void enqueue(int element) {
        if (rear == capacity - 1) {
            System.out.println("Queue overflow");
        }
        array[++rear] = element;
    }

    public void dequeue() {
        if (rear == -1) {
            System.out.println("Queue underflow");
        }
        System.out.println(array[front] + " has been removed from queue");
        front++;
    }

    public void peek() {
        if (rear == -1) {
            System.out.println("Queue is empty");
        }
        System.out.println(array[front]);
    }

    public void display() {
        if (rear == -1) {
            System.out.println("Queue is empty");
        }
        System.out.println(" ");
        for (int i = front; i <= rear; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void restore() {
        if (front == 0) {
            System.out.println("Can't restore first delete any element to restore");
        }
        front--;
    }

    public void readjust() {
        if (rear < front) {
            System.out.println("Queue is empty");
        }
        int i = 0;
        for (int j = front; j <= rear; j++, i++) {
            array[i] = array[j];
            front = 0;
            rear = j;
        }


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the queue capacity");
        int capacity = input.nextInt();
        Queue queue = new Queue(capacity);
        while (true) {
            System.out.println("1:Enqueue");
            System.out.println("2:Dequeue");
            System.out.println("3:peek");
            System.out.println("4:Restore");
            System.out.println("5:display");
            System.out.println("6:Readjust");
            System.out.println("7:Exit");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element you want to store in the Queue");
                    int element = input.nextInt();
                    queue.enqueue(element);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    queue.recover();
                    break;
                case 5:
                    queue.display();
                    break;
                case 6:
                    queue.readjust();
                    break;
                case 7:
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice");
                    return;

            }

        }

    }
}