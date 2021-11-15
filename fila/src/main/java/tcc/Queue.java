package tcc;

public class Queue {
    private Node font = null;
    private Node back = null;

    private static class Node {
        int item;
        Node next;
    }

    /**
     * Remove um elemento no começo da fila
     */
    public int dequeue() {
        if (isEmpty()) {
            return 0;
        }
        int item = font.item;
        if (font == back) {
            back = back.next;
        }
        font = font.next;
        return item;
    }

    /**
     * Inseri um elemento no fim da fila
     */
    public void enqueue(int item) {
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
    public int head() {
        if (isEmpty()) {
            return 0;
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
