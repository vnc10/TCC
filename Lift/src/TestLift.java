import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

public class TestLift {
    // covered:34, killed: 5, points: 89,
    @Test(timeout = 4000)
    public void testAssertEqualTopFloor() throws Throwable {
        int topFloor = 3;
        Lift l = new Lift(topFloor);
        assertEquals(topFloor, l.getTopFloor());
    }

    // covered: 48, killed: 9, points: 14
    @Test(timeout = 4000)
    public void testAssertEqualsCurrentFloor() throws Throwable {
        Lift l = new Lift(2, 2);
        l.goUp();
        l.goUp();
        assertEquals(2, l.getCurrentFloor());
    }

    // covered: 61, killed: 9, points: 8
    @Test(timeout = 4000)
    public void testLiftFull() throws Throwable {
        Lift l = new Lift(10, 2);
        l.addRiders(3);
        assertTrue(l.isFull());
    }

    @Test(timeout = 4000)
    public void testLiftIsNotFull() throws Throwable {
        Lift l = new Lift(2, 4);
        l.addRiders(3);
        assertFalse(l.isFull());
    }

    @Test(timeout = 4000)
    public void testAssertEqualsRiders() throws Throwable {
        Lift lift = new Lift(10);
        lift.addRiders(5);
        assertEquals(5, lift.getNumRiders());
    }
    @Test(timeout = 4000)
    public void testAssertEqualsCapacity() throws Throwable {
        Lift lift = new Lift(10, 5);
        assertEquals(5, lift.getCapacity());
    }
    @Test(timeout = 4000)
    public void testAssertNotEqualsCapacity() throws Throwable {
        Lift lift = new Lift(10, 5);
        assertNotEquals(4, lift.getCapacity());
    }

}