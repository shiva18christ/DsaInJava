class SingleLL{
    Node head;
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
//            System.out.println("Added "+data+" at the first node");
            return;
        }
        node.next=head;
        head=node;
//        System.out.println("Added data in the list");
    }
    public void addLast(int data){
        Node node=new Node(data);

        if(head== null){
            head=node;
        }else{
        Node currentnode=head;
        while(currentnode.next!=null){
            currentnode=currentnode.next;
        }
        currentnode.next=node;
        System.out.println("Added "+data+" at the last of list");
    }}
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
        if(head.next==null){
            head=null;
        }else{
        Node secndLnode=head;
        Node lastNode=secndLnode.next;
        while(lastNode.next!=null){
            secndLnode=secndLnode.next;
            lastNode=lastNode.next;
        }
        secndLnode.next=null;

    }}
    public void display(){
        Node node=head;
        if(head==null){
            System.out.println("List is empty");
        }
        while(node!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
    }
    public static void main(String[] args){
        SingleLL list=new SingleLL();
        list.addFirst(5);
        list.addFirst(10);
        list.addLast(15);
        list.display();
        list.deleteFirst();
        System.out.println("");
        list.display();
        list.deleteLast();
        System.out.println("");
        list.display();
        list.deleteLast();
        System.out.println("");
        list.display();
    }
}