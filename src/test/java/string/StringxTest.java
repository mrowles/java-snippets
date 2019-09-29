package string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringxTest {

    @Test
    public void testReverse() {
        assertEquals("namtaB", Stringx.reverse("Batman"));
        assertEquals("namrepuS dna namtaB", Stringx.reverse("Batman and Superman"));
    }
}
