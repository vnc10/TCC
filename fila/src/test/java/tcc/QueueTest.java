package tcc;

import org.junit.Test;

import static junit.framework.TestCase.*;

public class QueueTest {
    @Test(timeout = 4000)
    public void testVerifyQueueIsEmpty() throws Throwable {
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());
    }


    @Test(timeout = 4000)
    public void testRemove() throws Throwable {
        Queue queue = new Queue();
        queue.enqueue(1);
        assertEquals(1, queue.dequeue());
    }

    @Test(timeout = 4000)
    public void testAdd() throws Throwable {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(12);
        assertEquals(10, queue.head());
    }

    @Test(timeout = 4000)
    public void testDequeue() {
        Queue queue = new Queue();
        queue.enqueue(3);
        queue.enqueue(5);
        assertEquals(3, queue.dequeue());
    }

    @Test(timeout = 4000)
    public void testDequeueIfIsEmpty() {
        Queue queue = new Queue();
        assertEquals(0, queue.dequeue());
    }

    @Test(timeout = 4000)
    public void testIfHeadIsEmpty() {
        Queue queue = new Queue();
        assertEquals(0, queue.head());
    }
}
