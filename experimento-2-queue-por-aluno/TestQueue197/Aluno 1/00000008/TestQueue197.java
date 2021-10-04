import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestQueue197 {
    @Test(timeout = 4000)
    public void test() throws Throwable {
        Queue197 f = new Queue197();

        f.enqueue(1);
        f.enqueue(2);
        f.enqueue(3);
        f.enqueue(4);

        assertEquals(1, f.head());
        assertEquals(4, f.rear());
    }
}