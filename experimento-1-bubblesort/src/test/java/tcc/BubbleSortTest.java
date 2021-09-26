package tcc;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

//BUBBLESORT TEST = 106, 108, 111, 122
public class BubbleSortTest {
    @Test(timeout = 4000)
    public void TestBubbleSort326() throws Throwable {

        int[] valores = {43, 76, 22, 41, 9, 14, 2};
        int[] esperado = {2, 9, 14, 22, 41, 43, 76};

        BubbleSort bubble = new BubbleSort(valores);

        bubble.Ordena();

        assertArrayEquals(esperado, valores);

    }

    @Test(timeout = 4000)
    public void TestBubbleSort01021997_01() throws Throwable {
        int[] array1 = {1, 3, 2, 11, 4};
        BubbleSort teste = new BubbleSort(array1);
        int[] array2 = {1, 2, 3, 4, 11};
        assertArrayEquals(teste.Ordena(), array2);
    }

    @Test(timeout = 4000)
    public void TestBubbleSort01021997_02() throws Throwable {
        int[] array1 = {1, 3, 2, 11, 4};
        BubbleSort teste = new BubbleSort(array1);
        int[] array2 = {1, 2, 3, 4, 11};
        assertArrayEquals(array2, teste.Ordena());
    }

    @Test(timeout = 4000)
    public void TestBubbleSort01021997_03() throws Throwable {
        int[] array1 = {1};
        BubbleSort teste = new BubbleSort(array1);
        int[] array2 = {1};
        assertArrayEquals(array2, teste.Ordena());
    }

    @Test(timeout = 4000)
    public void TestBubbleSort01021997_04() throws Throwable {
        int[] array1 = {9, 2, 5, 3, 1};
        BubbleSort teste = new BubbleSort(array1);
        int[] array2 = {1, 2, 3, 5, 9};
        assertArrayEquals(array2, teste.Ordena());
    }

    //COMPILA PORÉM SEM ASSERTION
    @Test(timeout = 4000)
    public void TestBubbleSort14_01() throws Throwable {
        int[] test = {34, 47, 50, 56, 30, 73, 44, 99, 50, 40, 67, 14, 39};
        BubbleSort bubble = new BubbleSort(test);
        int[] teste = bubble.Ordena();
    }

    @Test(timeout = 4000)
    public void TestBubbleSort14_02() throws Throwable {
        int[] init = {34, 47, 50, 56, 30, 73, 44, 99, 50, 40, 67, 14, 39};
        int[] right = {14, 30, 34, 39, 40, 44, 47, 50, 50, 56, 67, 73, 99};
        BubbleSort bubble = new BubbleSort(init);
        int[] recived = bubble.Ordena();
        assertArrayEquals(recived, right);
    }

    @Test(timeout = 4000)
    public void TestBubbleSort14_03() throws Throwable {
        int[] init = {34, 47};
        int[] right = {34, 47};
        BubbleSort bubble = new BubbleSort(init);
        int[] recived = bubble.Ordena();
        assertArrayEquals(recived, right);
    }

    @Test(timeout = 4000)
    public void TestBubbleSort14_04() throws Throwable {
        int[] init = {34, 47, 50, 56, 30, 73, 44, 99, 40, 67, 14, 39};
        int[] right = {14, 30, 34, 39, 40, 44, 47, 50, 56, 67, 73, 99};
        BubbleSort bubble = new BubbleSort(init);
        int[] recived = bubble.Ordena();
        assertArrayEquals(recived, right);
    }

    @Test(timeout = 4000)
    public void TestBubbleSort14_05() throws Throwable {
        int[] init = {30, 14};
        int[] right = {14, 30};
        BubbleSort bubble = new BubbleSort(init);
        int[] recived = bubble.Ordena();
        assertArrayEquals(recived, right);
    }

    @Test(timeout = 4000)
    public void TestBubbleSort197_01() throws Throwable {
        int[] arr = {2, -9, 1, 4, 3, 10, 15};
        int[] expRes = {-9, 1, 2, 3, 4, 10, 15};

        BubbleSort instance = new BubbleSort(arr);
        int[] result = instance.Ordena();

        assertArrayEquals(expRes, result);

    }
}
