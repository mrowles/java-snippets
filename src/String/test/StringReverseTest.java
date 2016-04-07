package String.test;

import static org.junit.Assert.assertEquals;

import String.main.StringReverse;
import org.junit.Test;

public class StringReverseTest {

    @Test
    public void testReverseString() {
        StringReverse stringReverse = new StringReverse();
        assertEquals("namtaB", stringReverse.reverse("Batman"));
        assertEquals("namrepuS dna namtaB", stringReverse.reverse("Batman and Superman"));
    }
}
