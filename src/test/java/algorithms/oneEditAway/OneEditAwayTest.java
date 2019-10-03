package algorithms.oneEditAway;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OneEditAwayTest {
    @Test
    public void isOneEditAway() {
        assertTrue(OneEditAway.isOneEditAway("Batman", "atman"));
        assertTrue(OneEditAway.isOneEditAway("Batman", " Batman"));
        assertTrue(OneEditAway.isOneEditAway("Batman", "Batman "));
        assertTrue(OneEditAway.isOneEditAway("Batman", "Bat an"));

        assertFalse(OneEditAway.isOneEditAway("Batman", "atma"));
        assertFalse(OneEditAway.isOneEditAway("Batman", "Bat  n"));
    }
}