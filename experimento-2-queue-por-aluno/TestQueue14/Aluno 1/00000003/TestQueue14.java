import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestQueue14 {
    @Test(timeout = 4000)
    public void test() throws Throwable {
       Queue14 queue = new Queue14(); 
       boolean isEmpty = queue.isEmpty();
       assertIcons(isEmpty,false);
    }
}