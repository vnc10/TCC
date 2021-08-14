package tcc;

import org.junit.Test;

import static junit.framework.TestCase.*;
import static org.junit.Assert.assertNotEquals;

public class UpperAndLowerCaseTest {
    @Test(timeout = 4000)
    public void testVerifyIfConvertToUpperCaseIsEquals() throws Throwable {
        String palavra = "converter para maisculo";
        UpperAndLowerCase teste = new UpperAndLowerCase(palavra);
        assertEquals("CONVERTER PARA MAISCULO", teste.ToUpperCase());
    }
    @Test(timeout = 4000)
    public void testVerifyIfConvertToLowerCaseIsEquals() throws Throwable {
        String palavra = "CONVERTER para MINUSCULO";
        UpperAndLowerCase teste = new UpperAndLowerCase(palavra);
        assertEquals("converter para minusculo", teste.ToLowerCase());
    }
    @Test(timeout = 4000)
    public void testVerifyIfConvertToUpperCaseIsNotEquals() throws Throwable {
        String palavra = "converter para maisculo";
        UpperAndLowerCase teste = new UpperAndLowerCase(palavra);
        assertNotEquals("CONVERTEr PARA MAISCULO", teste.ToUpperCase());
    }
    @Test(timeout = 4000)
    public void testVerifyIfConvertToLowerCaseIsNotEquals() throws Throwable {
        String palavra = "CONVERTER para MINUSCULO";
        UpperAndLowerCase teste = new UpperAndLowerCase(palavra);
        assertNotEquals("aaaAAAAAA para minusculo", teste.ToLowerCase());
    }
}
