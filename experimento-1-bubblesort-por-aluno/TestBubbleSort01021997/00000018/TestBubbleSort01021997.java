import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestBubbleSort01021997 {
    @Test(timeout = 4000)
    public void test() throws Throwable {
        int[] array1 = {1,3,2,11,4};
        BubbleSort01021997 teste = new BubbleSort01021997(array1);
        int[] array2 = {1,2,3,4,11};
        assertArrayEquals(array2, teste.Ordena());
    }
}