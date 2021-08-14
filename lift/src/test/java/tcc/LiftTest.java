package tcc;

import org.junit.Test;

import static junit.framework.TestCase.*;
import static org.junit.Assert.assertNotEquals;

public class LiftTest {
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
    @Test(timeout = 4000)
    public void testGoDown() throws Throwable {
        Lift l = new Lift(2, 2);
        l.goUp();
        l.goUp();
        l.goDown();
        assertEquals(1, l.getCurrentFloor());
    }
    @Test(timeout = 4000)
    public void testCallUp() throws Throwable {
        Lift l = new Lift(10, 4);
        l.goUp();
        l.call(2);
        assertEquals(2, l.getCurrentFloor());
    }
    @Test(timeout = 4000)
    public void testCallDown() throws Throwable {
        Lift l = new Lift(10, 4);
        l.goUp();
        l.goUp();
        l.call(1);
        assertEquals(1, l.getCurrentFloor());
    }
    @Test(timeout = 4000)
    public void testCallUpFalse() throws Throwable {
        Lift l = new Lift(1);
        l.goUp();
        l.goUp();
        assertEquals(1, l.getCurrentFloor());
    }
    @Test(timeout = 4000)
    public void testGoDownFalse() throws Throwable {
        Lift l = new Lift(1);
        l.goDown();
        assertEquals(0, l.getCurrentFloor());
    }
    @Test(timeout = 4000)
    public void testWhenCallANegativeNumber() throws Throwable {
        Lift l = new Lift(1);
        l.call(-3);
        assertEquals(0, l.getCurrentFloor());
    }

}
