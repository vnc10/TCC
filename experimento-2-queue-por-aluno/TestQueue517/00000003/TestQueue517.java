import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestQueue517 {
    @Test(timeout = 4000)
    public void test() throws Throwable {
        Queue517 queue = new Queue517();
        int entry = 10;
        queue.enqueue(entry);
        int output = queue.head();
        
        assertThat(entry,output);
    }
}