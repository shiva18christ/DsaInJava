package Collections;

import java.util.Arrays;

class SwitchableStructure {
    private int[] array;
    private int size;
    private int capacity;
    private boolean isStack;

    public SwitchableStructure(boolean startAsStack, int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.size = 0;
        this.isStack = startAsStack;
    }

    public void switchMode() {
        isStack = !isStack;
        System.out.println("Switched to " + (isStack ? "Stack" : "Collections.Queue") + " mode.");
    }

    public void add(int element) {
        if (size == capacity) {
            System.out.println("Structure is full");
            return;
        }
        array[size++] = element;
    }

    public void remove() {
        if (size == 0) {
            System.out.println("Structure is empty");
            return;
        }
        if (isStack) {
            System.out.println("Popped: " + array[--size]);
        } else {
            System.out.println("Dequeued: " + array[0]);
            System.arraycopy(array, 1, array, 0, --size);
        }
    }

    public void display() {
        if (size == 0) {
            System.out.println("Structure is empty");
            return;
        }
        System.out.println("Elements: " + Arrays.toString(Arrays.copyOf(array, size)));
    }

    public static void main(String[] args) {
        SwitchableStructure structure = new SwitchableStructure(true, 10);
//        structure.add(1);
//        structure.add(2);
//        structure.add(3);
//        structure.display();
//        structure.remove();
//        structure.display();
//        structure.switchMode();
//        structure.add(4);
//        structure.add(5);
//        structure.display();
//        structure.remove();
//        structure.display();
        structure.switchMode();
        structure.add(1);
        structure.add(2);
        structure.switchMode();
        structure.add(3);
    }
}
