import junit.framework.Assert;
import org.junit.Test;
import java.util.ArrayList;

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
}
