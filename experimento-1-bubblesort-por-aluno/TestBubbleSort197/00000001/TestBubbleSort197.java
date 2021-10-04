import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestBubbleSort197 {
    @Test(timeout = 4000)
    public void test() throws Throwable {
        int[] arr = {2, -9, 1, 4, 3, 10, 15};
        int[] expRes = {-9, 1, 2, 3, 4, 10, 15};
        
        BubbleSort197 instance = new BubbleSort197();
        int[] result = instance.Ordena(arr);

        assertArrayEquals(expRes, result);
        
    }
}