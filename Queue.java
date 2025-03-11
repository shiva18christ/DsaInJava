public class Queue {
    private int[] customQueue;
    private int front;
    private int rear;
    private  int capacity;

    public Queue(int capacity){
        this.customQueue=new int[capacity];
        this.capacity=capacity;
        this.front=0;
        this.rear=-1;
    }
    public void enqueue(int element) {
        if(rear==capacity-1){
            System.out.println("Queue overflow");
        }else {
            rear = rear + 1;
            customQueue[rear] = element;
            System.out.println("Added element " + element + " in the queue");
        }
    }
    public void dequeue(){
        if(rear==-1){
            System.out.println("Queue underflow");
        }else {
            System.out.println("Removed element " + customQueue[front] + " from queue");
            front++;
        }
    }
    public void recover(){
        front--;
    }
    public void readjust(){
        int i=front;
        int j=0;
        while(i<=rear){
            customQueue[j]=customQueue[i];
            i++;
            j++;
        }
        front=0;
        rear=capacity-1;
    }
    public void display(){
        for(int i=front;i<=rear;i++){
            System.out.print(customQueue[i]+" ");
        }
        System.out.println(" ");
    }
    public void peek() {
        if (rear == -1) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(customQueue[front]);
        }
    }
    public boolean isFull(){
        if(rear==capacity-1){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(rear==-1){
            return true;
        }
        return false;
    }
    public int size(){
        return rear+1;
    }
    public static void main(String[] args){
        Queue queue=new Queue(6);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
//        queue.enqueue(70);
        queue.display();
        queue.dequeue();
        queue.display();
        queue.recover();
        queue.display();
        queue.peek();
        System.out.println(queue.isFull());
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
    }

}
