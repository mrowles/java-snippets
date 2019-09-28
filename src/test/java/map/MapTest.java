package map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class MapTest {

    @Test
    public void testPutEntry() {
        Map map = new Map<String, Integer>();

        map.put("first", 1);
        map.put("second", 2);
        map.put("third", 3);

        assertEquals(3, map.size());
    }

    @Test
    public void testOverwritePutEntry() {
        Map map = new Map<String, Integer>();

        map.put("first", 1);
        map.put("second", 2);
        map.put("third", 3);

        assertEquals(3, map.size());

        map.put("first", 9);
        assertEquals(3, map.size());
        assertEquals(9, map.get("first"));
    }

    @Test
    public void testRemoveEntry() {
        Map map = new Map<String, Integer>();

        map.put("first", 1);
        map.put("second", 2);
        map.put("third", 3);

        assertEquals(3, map.size());

        map.remove("second");

        assertEquals(2, map.size());
        assertNull(map.get("second"));
    }

}