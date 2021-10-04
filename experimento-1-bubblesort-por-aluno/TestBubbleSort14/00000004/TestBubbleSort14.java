import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestBubbleSort14 {
    @Test(timeout = 4000)
    public void test() throws Throwable {
        int[] init = {34, 47, 50, 56, 30, 73, 44, 99, 50, 40, 67, 14, 39};
        int[] right = {14, 30, 34, 39, 40, 44, 47, 50, 50, 56, 67, 73, 99};
        BubbleSort14 bubble = new BubbleSort14(test);
        int[] recived = bubble.Ordena();
        assertArrayEquals(recived, right);
    }
}