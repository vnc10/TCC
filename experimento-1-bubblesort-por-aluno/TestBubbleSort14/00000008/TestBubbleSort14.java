import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestBubbleSort14 {
    @Test(timeout = 4000)
    public void test() throws Throwable {
        int[] init = {30, 14};
        int[] right = {14, 30};
        BubbleSort14 bubble = new BubbleSort14(init);
        int[] recived = bubble.Ordena();
        assertArrayEquals(recived, right);
    }
}