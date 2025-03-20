package Collections;

public class DoublyLL {
    Node head;
    Node tail;
    static class Node{
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
            this.previous = null;
            this.next = null;
        }
    }
        public void addFirst(int data){
            Node node=new Node(data);
            if(head==null){
                head=tail=node;
            }
            head.previous=node;
            node.next=head;
            head=node;
        }
        public void addLast(int data){
            Node node=new Node(data);
            if(head==null){
                head=tail=node;
            }
            tail.next=node;
            node.previous=tail;
            tail=node;
        }
        public void displayForward(){
        Node node=head;
        if(node==null){
            System.out.println("The list is empty");
        }
        while(node!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
    }
    public void displayBackward(){
        Node node=tail;
        if(head==null){
            System.out.println("The list is empty");
        }
        while(node!=null){
            System.out.print(node.data+ " ");
            node=node.previous;
        }
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("The list is empty");
        }
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("The list is empty");
        }
        tail=tail.previous;
    }
    public static void main(String[] args){
        DoublyLL list=new DoublyLL();
        list.addFirst(5);
        list.addFirst(10);
        list.addLast(15);
        list.displayForward();
        System.out.println(" ");
        list.displayBackward();
        list.deleteFirst();
        System.out.println("");
        list.displayForward();
        System.out.println("");
        list.deleteLast();

    }
    }

