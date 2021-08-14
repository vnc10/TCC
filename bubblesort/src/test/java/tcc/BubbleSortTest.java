package tcc;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {
    @Test(timeout = 4000)
    public void testVectorSort() throws Throwable {
        int[] array = {3, 60, 35, 2, 45, 320, 5};
        int[] ordenado = {2, 3, 5, 35, 45, 60, 320};
        BubbleSort bubble = new BubbleSort(array);
        bubble.ordena();
        for (int i = 0; i < array.length; i++) {
            assertEquals(ordenado[i], array[i]);
        }
    }

    @Test(timeout = 4000)
    public void testShouldDoNothingWithOneElementArray() throws Throwable {
        int[] array = {42};
        BubbleSort bubble = new BubbleSort(array);
        bubble.ordena();
        assertArrayEquals(new int[]{42}, array);
    }
}
