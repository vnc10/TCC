import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestQueue14 {
    @Test(timeout = 4000)
    public void test() throws Throwable {
       Queue14 queue = new Queue14(); 
       int initValue = 34;
       queue.enqueue(initValue);
       int res = queue.dequeue();
       boolean isEmpty = queue.isEmpty();
       assertEquals(isEmpty, true);
    }
}