import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

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
    public void testPushValue() throws Throwable {
        Stack stack = new Stack();
        Integer value = 1;
        stack.push(value);
        stack.push(value);
        stack.push(value);
        stack.push(value);
        stack.push(value);
        stack.push(value);
        stack.push(value);
        stack.push(value);
        stack.push(value);
        stack.push(value);

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
    public void test4() throws Throwable {
        Stack<String> stack = new Stack<String>();
        String string3 = "test";
        stack.push(string3);
        assertEquals(string3, stack.pop());
    }

}
