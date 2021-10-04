import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestQueue197 {
    @Test(timeout = 4000)
    public void test() throws Throwable {
        public int dequeue() {
        if (front == 0) {
            return -1;
        } else {
            Node aux = front;
            front = front.next;

            return aux.item;
        }
    }
    }
}