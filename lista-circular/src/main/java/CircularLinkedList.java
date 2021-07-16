

class Node {

    int value;
    Node nextNode;

    public Node(int value) {
        this.value = value;
    }
}

public class CircularLinkedList {
    private Node head = null;
    private Node tail = null;

    public int getHead() {
        return head.value;
    }

    public int getTail() {
        return tail.value;
    }


    public void addNode(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            tail.nextNode = newNode;
        }

        tail = newNode;
        tail.nextNode = head;
    }

    public boolean containsNode(int searchValue) {
        Node currentNode = head;

        if (head == null) {
            return false;
        } else {
            do {
                if (currentNode.value == searchValue) {
                    return true;
                }
                currentNode = currentNode.nextNode;
            } while (currentNode != head);
            return false;
        }
    }

    public boolean deleteNode(int valueToDelete) {
        Node currentNode = head;
        isEmpty();
        do {
            Node nextNode = currentNode.nextNode;
            if (nextNode.value == valueToDelete) {
                if (tail == head) { // the list has only one single element
                    head = null;
                    tail = null;
                } else {
                    currentNode.nextNode = nextNode.nextNode;
                    if (head == nextNode) { //we're deleting the head
                        head = head.nextNode;
                    }
                    if (tail == nextNode) { //we're deleting the tail
                        tail = currentNode;
                    }
                }
                return true;
            }
            currentNode = nextNode;
        } while (currentNode != head);
        return false;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean print() {
        Node currentNode = head;

        if (head != null) {
            do {
                System.out.printf(currentNode.value + " ");
                currentNode = currentNode.nextNode;
            } while (currentNode != head);
        }
        return true;
    }

}