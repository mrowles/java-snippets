package hashmap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class HashMapTest {

    @Test
    public void testPutEntry() {
        HashMap hashMap = new HashMap<String, Integer>();

        hashMap.put("first", 1);
        hashMap.put("second", 2);
        hashMap.put("third", 3);

        assertEquals(3, hashMap.size());
    }

    @Test
    public void testOverwritePutEntry() {
        HashMap hashMap = new HashMap<String, Integer>();

        hashMap.put("first", 1);
        hashMap.put("second", 2);
        hashMap.put("third", 3);

        assertEquals(3, hashMap.size());

        hashMap.put("first", 9);
        assertEquals(3, hashMap.size());
        assertEquals(9, hashMap.get("first"));
    }

    @Test
    public void testRemoveEntry() {
        HashMap hashMap = new HashMap<String, Integer>();

        hashMap.put("first", 1);
        hashMap.put("second", 2);
        hashMap.put("third", 3);

        assertEquals(3, hashMap.size());

        hashMap.remove("second");

        assertEquals(2, hashMap.size());
        assertNull(hashMap.get("second"));
    }

}