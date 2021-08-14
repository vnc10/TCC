package tcc;

import org.junit.Test;

import static junit.framework.TestCase.assertNull;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class LinkedListTest {
    @Test(timeout = 4000)
    public void testVerifyEmpty() throws Throwable {
        LinkedList list = new LinkedList();
        assertTrue(list.isEmpty());
    }
    @Test(timeout = 4000)
    public void testVerifySize() throws Throwable {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(3);
        list.add(10);
        assertEquals(3, list.size());
    }
    @Test(timeout = 4000)
    public void testVerifyIsNotEmpty() throws Throwable {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(3);
        list.add(10);
        assertFalse(list.isEmpty());
    }
    @Test(timeout = 4000)
    public void testGetElementByIndex() throws Throwable {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(3);
        list.add(10);
        assertEquals(3, list.get(1));
    }
    @Test(timeout = 4000)
    public void testGetIndexByElement() throws Throwable {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(3);
        list.add(10);
        list.add(12);
        list.add(1);
        assertEquals(3, list.indexOf(12));
    }
    @Test(timeout = 4000)
    public void testRemove() throws Throwable {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(3);
        list.remove(3);
        list.add(10);
        assertEquals(2, list.size());
    }
    @Test(timeout = 4000)
    public void testRemove2() throws Throwable {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(3);
        assertTrue(list.remove(3));
    }
    @Test(timeout = 4000)
    public void testWhenGetAElementIsNull() throws Throwable {
        LinkedList list = new LinkedList();
        assertNull(list.get(1));
    }

    @Test(timeout = 4000)
    public void testWhenElementIsNotInTheList() throws Throwable {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        assertNull(list.get(4));
    }

    @Test(timeout = 4000)
    public void testWhenTheIndexDoesntExiste() throws Throwable {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        assertEquals(-1, list.indexOf(4));
    }

    @Test(timeout = 4000)
    public void testRemoveAnElementThatDoesntExistBecauseTheListIsEmpty() throws Throwable {
        LinkedList list = new LinkedList();
        assertFalse(list.remove(1));
    }

    @Test(timeout = 4000)
    public void testRemoveAnElementThatDoesntExist() throws Throwable {
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(5);
        assertFalse(list.remove(1));
    }
}
