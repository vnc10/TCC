package tcc;

import org.junit.Test;

import static junit.framework.TestCase.*;

public class CircularQueueTest {
    @Test(timeout = 4000)
    public void testVerifyQueueIsFull() throws Throwable {
        CircularQueue queue = new CircularQueue(2);
        queue.enQueue(3);
        queue.enQueue(2);
        assertTrue(queue.isFull());
    }

    @Test(timeout = 4000)
    public void testVerifyQueueIsEmpty() throws Throwable {
        CircularQueue queue = new CircularQueue(2);
        assertTrue(queue.isEmpty());
    }

    @Test(timeout = 4000)
    public void testVerifyQueueIsNotEmpty() throws Throwable {
        CircularQueue queue = new CircularQueue(2);
        queue.enQueue(3);
        assertFalse(queue.isEmpty());
    }

    @Test(timeout = 4000)
    public void testGetElement() throws Throwable {
        CircularQueue queue = new CircularQueue(2);
        queue.enQueue(3);
        assertEquals(3, queue.get(0));
    }

    @Test(timeout = 4000)
    public void testRemoveElement() throws Throwable {
        CircularQueue queue = new CircularQueue(2);
        queue.enQueue(2);
        queue.enQueue(4);
        assertEquals(2, queue.deQueue());
    }

    @Test(timeout = 4000)
    public void testAddElement() throws Throwable {
        CircularQueue queue = new CircularQueue(4);
        queue.enQueue(2);
        queue.enQueue(4);
        queue.enQueue(1);
        queue.enQueue(12);
        queue.enQueue(20);
        assertTrue(queue.enQueue(10));
    }

    @Test(timeout = 4000)
    public void testRemoveElementWhenFrontEqualRear() throws Throwable {
        CircularQueue queue = new CircularQueue(3);
        queue.enQueue(3);
        assertEquals(3, queue.deQueue());
    }

    @Test(timeout = 4000)
    public void testAddElementWhenQueueIsNotEmptyAndHadAtLeastOneElement() throws Throwable {
        CircularQueue queue = new CircularQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(10);
        assertEquals(10, queue.get(2));
    }

    @Test(timeout = 4000)
    public void testAddOneElementAndRemoveOneElementAfterVerifyIsEmpty() throws Throwable {
        CircularQueue queue = new CircularQueue(3);
        queue.enQueue(3);
        queue.deQueue();
        assertTrue(queue.isEmpty());
    }

    @Test(timeout = 4000)
    public void testIsFullWithAddAndRemoveElements() throws Throwable {
        CircularQueue queue = new CircularQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.deQueue();
        assertFalse(queue.isFull());
    }

    @Test(timeout = 4000)
    public void test() throws Throwable {
        CircularQueue queue = new CircularQueue(3);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(6);
        queue.deQueue();
        assertEquals(4, queue.deQueue());
    }

}
