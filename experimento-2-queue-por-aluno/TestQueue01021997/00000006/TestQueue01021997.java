import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestQueue01021997 {
    @Test(timeout = 4000)
    public void test() throws Throwable {
        Queue01021997 queue = new Queue01021997(); 
        aux = queue.dequeue();
        assertEquals(1, aux);
    }
}