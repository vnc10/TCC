public class Queue<T> {
    Node font = null;
    Node back = null;

    private class Node {
        T item;
        Node next;
    }

    /**
     * Remove an element from the end of the queue
     */
    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        T item = font.item;
        if (font == back) {
            back = back.next;
        }
        font = font.next;
        return item;
    }

    /**
     * Insert an element at the beginning of the queue
     */
    public void enqueue(T item) {
        Node oldback = back;
        back = new Node();
        back.item = item;
        if (isEmpty()) {
            font = back;
        } else {
            oldback.next = back;
        }
    }

    /**
     * Check whether the queue is empty or not
     */
    public boolean isEmpty() {
        return font == null;
    }
}
