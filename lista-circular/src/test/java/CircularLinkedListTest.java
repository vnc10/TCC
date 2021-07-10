import org.junit.Test;

import static junit.framework.TestCase.*;

public class CircularLinkedListTest {
    @Test(timeout = 4000)
    public void testListHasAnElement() throws Throwable {
        CircularLinkedList cll = new CircularLinkedList();
        cll.addNode(8);
        cll.addNode(37);
        assertTrue(cll.containsNode(8));
    }

    @Test(timeout = 4000)
    public void testLookingForNonExistingElement() {
        CircularLinkedList cll = new CircularLinkedList();
        cll.addNode(5);
        assertFalse(cll.containsNode(11));
    }

    @Test(timeout = 4000)
    public void test() {
        CircularLinkedList cll = new CircularLinkedList();
        CircularLinkedList expected = new CircularLinkedList();
        expected.addNode(8);
        cll.addNode(8);
        assertEquals(expected.getHead(), cll.getHead());
    }

    @Test(timeout = 4000)
    public void testRemoveANode() {
        CircularLinkedList cll = new CircularLinkedList();
        cll.addNode(8);
        cll.addNode(10);
        cll.deleteNode(10);
        assertEquals(8, cll.getTail());
    }

    @Test(timeout = 4000)
    public void testPrint() {
        CircularLinkedList cll = new CircularLinkedList();
        cll.addNode(1);
        cll.addNode(2);
        cll.addNode(3);
        cll.addNode(4);
        assertTrue(cll.print());

    }

    @Test(timeout = 4000)
    public void testGetHead() {
        CircularLinkedList cll = new CircularLinkedList();
        cll.addNode(12);
        cll.addNode(2);
        cll.addNode(31);
        cll.addNode(46);
        assertEquals(12, cll.getHead());

    }

    @Test(timeout = 4000)
    public void testGetTail() {
        CircularLinkedList cll = new CircularLinkedList();
        cll.addNode(12);
        cll.addNode(2);
        cll.addNode(31);
        cll.addNode(46);
        assertEquals(46, cll.getTail());

    }

    @Test(timeout = 4000)
    public void testIsEmpty() {
        CircularLinkedList cll = new CircularLinkedList();
        assertTrue(cll.isEmpty());

    }

    @Test(timeout = 4000)
    public void testIsNotEmpty() {
        CircularLinkedList cll = new CircularLinkedList();
        cll.addNode(2);
        assertFalse(cll.isEmpty());

    }
}
