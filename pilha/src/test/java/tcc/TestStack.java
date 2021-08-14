package tcc;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

public class TestStack {
    @Test(timeout = 4000)
    public void testVerifyEmptyStack() throws Throwable {
        Stack<String> stack = new Stack<String>();
        assertTrue(stack.isEmpty());
    }

    @Test(timeout = 4000)
    public void testAssertEqualsCapacity() throws Throwable {
        Stack<Integer> stack = new Stack<Integer>();
        assertEquals(10, stack.getCapacity());
    }

    @Test(timeout = 4000)
    public void testSetCapacity() throws Throwable {
        Stack<Integer> stack = new Stack<Integer>();
        stack.setCapacity(20);
        assertEquals(20, stack.getCapacity());
    }

    @Test(timeout = 4000)
    public void testVerifyIsNotEmptyStack() {
        Stack<String> stack = new Stack<String>();
        stack.push("test");
        assertFalse(stack.isEmpty());
    }

    @Test(timeout = 4000)
    public void testExceptFromPop() {
        Stack<Integer> stack = new Stack<Integer>();
        Exception exception = assertThrows(IllegalArgumentException.class, stack::pop);
        assertEquals("Stack empty", exception.getMessage());
    }

    @Test(timeout = 4000)
    public void testExceptFromPush() {
        Stack<Integer> stack = new Stack<Integer>();
        stack.setCapacity(0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> stack.push(2));
        assertEquals("Stack exceeded capacity!", exception.getMessage());
    }

    @Test(timeout = 4000)
    public void testPop(){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(2);
        stack.push(1);
        assertTrue(stack.pop());

    }

}
