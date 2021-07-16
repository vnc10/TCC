import org.junit.Test;

import static junit.framework.TestCase.*;

public class QueueTest {
    @Test(timeout = 4000)
    public void testVerifyQueueIsEmpty() throws Throwable {
        Queue<String> queue = new Queue<String>();
        assertTrue(queue.isEmpty());
    }

    @Test(timeout = 4000)
    public void testVerifyQueueIsNotEmpty() throws Throwable {
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(2);
        assertFalse(queue.isEmpty());
    }

    @Test(timeout = 4000)
    public void testRemove() throws Throwable {
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(1);
        assertEquals(Integer.valueOf(1), queue.dequeue());
    }

    @Test(timeout = 4000)
    public void testAdd() throws Throwable {
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(10);
        queue.enqueue(12);
        assertEquals(Integer.valueOf(10), queue.head());
    }

    @Test(timeout = 4000)
    public void testDequeueEmpty() {
        Queue<Integer> queue = new Queue<Integer>();
        assertNull(queue.dequeue());
    }

    @Test(timeout = 4000)
    public void testIsEmpty() {
        Queue<Integer> queue = new Queue<Integer>();
        assertNull(queue.head());
    }

    @Test(timeout = 4000)
    public void testDequeue() {
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(3);
        queue.enqueue(5);
        assertEquals(Integer.valueOf(3), queue.dequeue());
    }
}
