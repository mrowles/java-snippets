package algorithms.string;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void testStrstrKmp() {
        assertEquals(0, Stringx.strstrKmp("Batman", "Bat"));
        assertEquals(1, Stringx.strstrKmp("Batman", "atm"));
        assertEquals(-1, Stringx.strstrKmp("Batman and Superman", "Robin"));
        assertEquals(11, Stringx.strstrKmp("Batman and Superman", "Super"));
    }

    @Test
    public void testOneEditAwayMatch() {
        assertTrue(Stringx.oneEditAwayMatch("Batman", "atman"));
        assertTrue(Stringx.oneEditAwayMatch("Batman", " Batman"));
        assertTrue(Stringx.oneEditAwayMatch("Batman", "Batman "));
        assertTrue(Stringx.oneEditAwayMatch("Batman", "Bat an"));

        assertFalse(Stringx.oneEditAwayMatch("Batman", "atma"));
        assertFalse(Stringx.oneEditAwayMatch("Batman", "Bat  n"));
    }
}
