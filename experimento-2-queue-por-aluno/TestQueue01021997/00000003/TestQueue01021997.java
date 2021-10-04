import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestQueue01021997 {
    @Test(timeout = 4000)
    public void test() throws Throwable {
        Queue01021997 teste = new Queue01021997();
        teste.enqueue(2);
        assertEquals(teste.front.item, teste.back.item);
    }
}