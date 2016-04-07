package Map.test;

import static org.junit.Assert.assertEquals;

import Map.main.Entry;
import org.junit.Test;

public class EntryTest {

    @Test
    public void testCreateEntry() {
        Entry anEntry = new Entry("key", 12345);
        assertEquals("key", anEntry.getKey());
        assertEquals(12345, anEntry.getValue());

        anEntry.setValue(54321);
        assertEquals(54321, anEntry.getValue());
    }
}