package tcc;

import org.junit.Test;

import static junit.framework.TestCase.*;

//QUEUE TEST = 112, 114, 116, 123, 124

public class QueueTest {
    //112 NENHUM COMPILADO
    //114
    @Test(timeout = 4000)
    public void TestQueue01021997_01() throws Throwable {
        Queue queue = new Queue();
        boolean empty = queue.isEmpty();
        assertEquals(empty,true);
    }

    @Test(timeout = 4000)
    public void TestQueue01021997_02() throws Throwable {
        Queue queue = new Queue();
        int aux = queue.dequeue();
        assertEquals(1, aux);
    }

    @Test(timeout = 4000)
    public void TestQueue01021997_03() throws Throwable {
        Queue queue = new Queue();
        queue.enqueue(2);
        int aux = queue.head();
        assertEquals(2, aux);
    }

    @Test(timeout = 4000)
    public void TestQueue01021997_04() throws Throwable {
        Queue queue = new Queue();
        queue.enqueue(2);
        int aux = queue.dequeue();
        assertEquals(1, aux);
    }
    //116
    @Test(timeout = 4000)
    public void TestQueue14_01() throws Throwable {
        Queue queue = new Queue();
        boolean isEmpty = queue.isEmpty();
        assertEquals(isEmpty,false);
    }

    //Comentario o assertion?
    @Test(timeout = 4000)
    public void TestQueue14_02() throws Throwable {
        Queue queue = new Queue();
        boolean isEmpty = queue.isEmpty();
        // assertEquals(isEmpty,false);
    }

    @Test(timeout = 4000)
    public void TestQueue14_03() throws Throwable {
        Queue queue = new Queue();
        boolean isEmpty = queue.isEmpty();
        assertEquals(isEmpty,true);
    }

    @Test(timeout = 4000)
    public void TestQueue14_04() throws Throwable {
        Queue queue = new Queue();
        int head = queue.head();
        assertEquals(head,10);
    }

    @Test(timeout = 4000)
    public void TestQueue14_05() throws Throwable {
        Queue queue = new Queue();
        int initValue = 34;
        queue.enqueue(initValue);
        int head = queue.head();
        assertEquals(head,initValue);
    }

    @Test(timeout = 4000)
    public void TestQueue14_06() throws Throwable {
        Queue queue = new Queue();
        int initValue = 34;
        queue.enqueue(initValue);
        int res = queue.dequeue();
        boolean isEmpty = queue.isEmpty();
        assertEquals(isEmpty, true);
    }

    @Test(timeout = 4000)
    public void TestQueue14_07() throws Throwable {
        Queue queue = new Queue();
        int initValue = 34;
        queue.enqueue(initValue);
        int res = queue.dequeue();
        boolean isEmpty = queue.isEmpty();
        assertEquals(isEmpty, false);
    }

    // 123

    @Test(timeout = 4000)
    public void TestQueue197_01() throws Throwable {
        Queue f = new Queue();

        f.enqueue(1);
        f.enqueue(2);
        f.enqueue(3);
        f.enqueue(4);

        assertEquals(1, f.head());
        //assertEquals(4, f.rear());
    }

    @Test(timeout = 4000)
    public void TestQueue197_02() throws Throwable {
        Queue f = new Queue();

        assertTrue(f.isEmpty());
    }

    @Test(timeout = 4000)
    public void TestQueue197_03() throws Throwable {
        Queue f = new Queue();

        f.enqueue(1);

        assertFalse(f.isEmpty());
    }

    @Test(timeout = 4000)
    public void TestQueue197_04() throws Throwable {
        Queue f = new Queue();

        assertEquals(-1, f.head());
    }

    @Test(timeout = 4000)
    public void TestQueue197_05() throws Throwable {
        Queue f = new Queue();

        f.enqueue(5);

        assertEquals(5, f.head());
    }

//    @Test(timeout = 4000)
//    public void TestQueue197_06() throws Throwable {
//        Queue f = new Queue();
//
//        assertEquals(-1, f.rear());
//    }

//    @Test(timeout = 4000)
//    public void TestQueue197_07() throws Throwable {
//        Queue f = new Queue();
//
//        f.enqueue(5);
//
//        assertEquals(5, f.rear());
//    }

    @Test(timeout = 4000)
    public void TestQueue197_07() throws Throwable {
        Queue f = new Queue();

        f.enqueue(1);
        f.enqueue(2);
        f.enqueue(3);
        f.enqueue(4);

        assertEquals(1, f.head());
//        assertEquals(4, f.rear());
    }

    @Test(timeout = 4000)
    public void TestQueue197_08() throws Throwable {
        Queue f = new Queue();

        assertEquals(-1, f.head());
    }

    //124

    @Test(timeout = 4000)
    public void TestQueue517_01() throws Throwable {
        Queue queue = new Queue();
        int entry = 10;
        queue.enqueue(entry);
        int output = queue.head();

        assertEquals(entry,output);
    }
}
