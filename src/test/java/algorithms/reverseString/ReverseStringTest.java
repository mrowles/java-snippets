package algorithms.reverseString;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseStringTest {
    @Test
    public void testReverse() {
        assertEquals("namtaB", ReverseString.reverse("Batman"));
        assertEquals("namrepuS dna namtaB", ReverseString.reverse("Batman and Superman"));
    }
}
