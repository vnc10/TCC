import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class VerifyPrimeNumberTest {
    @Test(timeout = 4000)
    public void testIsAPrimeNumber() throws Throwable {
        int n = 5;
        VerifyPrimeNumber prime = new VerifyPrimeNumber(n);
        assertEquals(1, prime.verify());
    }

    @Test(timeout = 4000)
    public void testIsNotAPrimeNumber() throws Throwable {
        int n = 1;
        VerifyPrimeNumber prime = new VerifyPrimeNumber(n);
        assertEquals(0, prime.verify());
    }

}
