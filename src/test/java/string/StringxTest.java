package string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringxTest {

    @Test
    public void testReverse() {
        assertEquals("namtaB", Stringx.reverse("Batman"));
        assertEquals("namrepuS dna namtaB", Stringx.reverse("Batman and Superman"));
    }

    @Test
    public void testStrstrIterative() {
        assertEquals(0, Stringx.strstrIterative("Batman", "Bat"));
        assertEquals(1, Stringx.strstrIterative("Batman", "atm"));
        assertEquals(-1, Stringx.strstrIterative("Batman and Superman", "Robin"));
        assertEquals(11, Stringx.strstrIterative("Batman and Superman", "Super"));
    }
}
