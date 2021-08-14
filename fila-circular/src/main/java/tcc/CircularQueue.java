package tcc;

import java.util.ArrayList;

public class CircularQueue {
    private final int size;
    private int front;
    private int rear;
    private final ArrayList<Integer> queue = new ArrayList<Integer>();

    CircularQueue(int size) {
        this.size = size;
        this.front = this.rear = -1;
    }

    // Inseri um novo elemento na fila.
    public boolean enQueue(int data) {

        isFull();

        if (isEmpty()) {
            front = 0;
            rear = 0;
            queue.add(rear, data);
        } else {
            rear = (rear + 1);
            queue.add(rear, data);
            }
        return true;
    }

    // Remove um elemento na fila
    public int deQueue() {
        int temp;

        isEmpty();
        temp = queue.get(front);

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = front + 1;
        }

        return temp;
    }

    public boolean isFull() {
        return (front == 0 && rear == size - 1) ||
                (rear == (front - 1) % (size - 1));
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public int get(int i) {
        return queue.get(i);
    }
}
