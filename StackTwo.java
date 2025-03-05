public class StackTwo {
    private int[] array;
    private int top;
    private int capacity;

    StackTwo(int capacity) {
        this.array = new int[capacity];
        this.top = -1;
        this.capacity = capacity;
    }

    public void push(int element) {
        if (top == -1) {
            top++;
            array[top] = element;
            return;
        }
        while (top <= capacity) {
            top++;
            array[top] = element;
            return;
        }
        System.out.println("Stack overflow");
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        top--;
        return;
    }
    void display(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        for(int i=top;i>=0;i--){
            System.out.print(array[i]+" ");
        }
        System.out.println("End of stack");
    }
    public void restore(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        if(top==capacity-1){
            System.out.println("no elements wre deleted from the stack ");
        }
        top++;
    }
    public void readjust(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        if(top==capacity-1){
            System.out.println("no elements wre deleted from the stack ");
        }


    }
    public static void main(String[] args){
        StackTwo stack=new StackTwo(5);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(8);
        stack.push(10);
        stack.display();
        stack.pop();
        stack.display();
        stack.restore();
        stack.display();
        stack.restore();

    }
}
