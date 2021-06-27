public class Queue<T> {
    Node font = null;
    Node back = null;

    private class Node {
        T item;
        Node next;
    }

    /**
     * Remove um elemento do fim da fila
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
     * Inseri um elemento no começo da fila
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
     * Retorna o primeiro elemento da fila
     */
    public T head() {
        if (isEmpty()) {
            return null;
        }
        return font.item;
    }

    /**
     * Verifica se a fila está vazia
     */
    public boolean isEmpty() {
        return font == null;
    }
}
