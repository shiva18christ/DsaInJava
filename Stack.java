import java.util.Arrays;

class Stack{
    private  int[] customStack;
    private int top;
    private  int capacity;

    public Stack(int capacity){
        this.customStack=new int[capacity];
        this.capacity=capacity;
        this.top=-1;
    }
    public void push(int element){
        if(top==capacity-1){
            System.out.println("Stack overflow");
        }else {
            top = top + 1;
            customStack[top] = element;
          System.out.println("Pushed element "+element+" into stack");
        }
    }
    public void display(){
        for(int i=0;i<=top;i++){
            System.out.print(customStack[i]+" ");
        }
    }
    public void pop(){
        if(top==-1){
            System.out.println("Stack underflow");
        }else {
            System.out.println("popped element " + customStack[top] + " from stack");
            top = top - 1;
        }
    }
    public void peek(){
        System.out.println(customStack[top]);
    }
    public void recover(){
        top=top+1;
    }
    public boolean is_full(){
        if(top==capacity-1) {
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
          Stack stack=new Stack(5);
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);

////        stack.display();
             stack.pop();
             stack.display();
             stack.peek();
             stack.recover();
             stack.display();
           System.out.println(stack.is_full());
          System.out.println(stack.isEmpty());




    }

}