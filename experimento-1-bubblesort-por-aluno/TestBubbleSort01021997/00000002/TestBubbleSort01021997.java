import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestBubbleSort01021997 {
    @Test(timeout = 4000)
    public void test() throws Throwable {
        array1 = new array[1,3,2,11,4];
        BubbleSort01021997 = new BubbleSort01021997;
        array2 = BubbleSort01021997(array1).Ordena;
        array3 = new array[1,2,3,4,11];
        assertArrayEquals(array3,array2);
    }
}