package algorithms.strStr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StrStrTest {
    @Test
    public void iterative() {
        assertEquals(0, StrStr.iterative("Batman", "Bat"));
        assertEquals(1, StrStr.iterative("Batman", "atm"));
        assertEquals(-1, StrStr.iterative("Batman and Superman", "Robin"));
        assertEquals(11, StrStr.iterative("Batman and Superman", "Super"));
    }

    @Test
    public void kmp() {
        assertEquals(0, StrStr.kmp("Batman", "Bat"));
        assertEquals(1, StrStr.kmp("Batman", "atm"));
        assertEquals(-1, StrStr.kmp("Batman and Superman", "Robin"));
        assertEquals(11, StrStr.kmp("Batman and Superman", "Super"));
    }
}
