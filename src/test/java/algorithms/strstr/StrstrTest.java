package algorithms.strstr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StrstrTest {
    @Test
    public void iterative() {
        assertEquals(0, Strstr.iterative("Batman", "Bat"));
        assertEquals(1, Strstr.iterative("Batman", "atm"));
        assertEquals(-1, Strstr.iterative("Batman and Superman", "Robin"));
        assertEquals(11, Strstr.iterative("Batman and Superman", "Super"));
    }

    @Test
    public void kmp() {
        assertEquals(0, Strstr.kmp("Batman", "Bat"));
        assertEquals(1, Strstr.kmp("Batman", "atm"));
        assertEquals(-1, Strstr.kmp("Batman and Superman", "Robin"));
        assertEquals(11, Strstr.kmp("Batman and Superman", "Super"));
    }
}