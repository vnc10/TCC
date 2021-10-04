import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestBubbleSort14 {
    @Test(timeout = 4000)
    public void test() throws Throwable {
        int[] init = {34, 47};
        int[] right = {34, 47};
        BubbleSort14 bubble = new BubbleSort14(init);
        int[] recived = bubble.Ordena();
        assertArrayEquals(recived, right);
    }
}