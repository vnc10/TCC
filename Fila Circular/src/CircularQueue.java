import java.util.ArrayList;

public class CircularQueue {
    private int size, front, rear;
    private ArrayList<Integer> queue = new ArrayList<Integer>();

    CircularQueue(int size) {
        this.size = size;
        this.front = this.rear = -1;
    }

    // Inseri um novo elemento na fila.
    public void enQueue(int data) {

        if (!isFull()) ;

        if (isEmpty()) {
            front = 0;
            rear = 0;
            queue.add(rear, data);
        } else if (rear == size - 1 && front != 0) {
            rear = 0;
            queue.set(rear, data);
        } else {
            rear = (rear + 1);

            if (front <= rear) {
                queue.add(rear, data);
            } else {
                queue.set(rear, data);
            }
        }
    }

    // Remove um elemento na fila
    public int deQueue() {
        int temp;

        if (isEmpty()) ;
        temp = queue.get(front);

        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front = front + 1;
        }

        return temp;
    }

    public boolean isFull() {
        if ((front == 0 && rear == size - 1) ||
                (rear == (front - 1) % (size - 1))) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    public int get(int i) {
        return queue.get(i);
    }
}
