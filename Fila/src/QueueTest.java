import org.junit.Test;

import static junit.framework.TestCase.*;

public class QueueTest {
    @Test(timeout = 4000)
    public void testVerifyQueueIsEmpty() throws Throwable {
        Queue<String> queue = new Queue<>();
        assertTrue(queue.isEmpty());
    }

    @Test(timeout = 4000)
    public void testVerifyQueueIsNotEmpty() throws Throwable {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(2);
        assertFalse(queue.isEmpty());
    }

    @Test(timeout = 4000)
    public void testRemove() throws Throwable {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        assertEquals(new Integer(1), queue.dequeue());
    }

    @Test(timeout = 4000)
    public void testAdd() throws Throwable {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(10);
        queue.enqueue(12);
        assertEquals(new Integer(10), queue.head());
    }
}
