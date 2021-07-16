public class Stack<T> {
    private int capacity = 10;
    private int pointer = 0;
    private T[] objects = (T[]) new Object[capacity];


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void push(T o) {
        if (pointer >= capacity)
            throw new IllegalArgumentException("Stack exceeded capacity!");
        objects[pointer++] = o;
    }

    public boolean pop() {
        if (pointer <= 0) {
            throw new IllegalArgumentException("Stack empty");
        }
        --pointer;
        return true;
    }

    public boolean isEmpty() {
        return pointer <= 0;
    }
}
