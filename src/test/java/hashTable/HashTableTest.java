package hashTable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HashTableTest {

    @Test
    public void testCreate() {
        HashTable<String, Integer> table = new HashTable<>(10);
        assertEquals(0, table.size());
        assertTrue(table.isEmpty());
    }

    @Test
    public void testAdd() {
        HashTable<String, Integer> table = new HashTable<>(10);
        assertEquals(0, table.size());
        assertTrue(table.isEmpty());
    }

    @Test
    public void testGet() {
        HashTable<String, Integer> table = new HashTable<>(10);
        table.add("abc", 123);
        table.add("def", 456);
        table.add("ghi", 789);
        assertEquals(123, table.get("abc").intValue());
        assertEquals(456, table.get("def").intValue());
        assertEquals(789, table.get("ghi").intValue());
    }

    @Test
    public void testRemove() {
        HashTable<String, Integer> table = new HashTable<>(10);
        table.add("abc", 123);
        table.add("def", 456);

        assertEquals(2, table.size());

        table.remove("def");
        assertEquals(1, table.size());
        assertEquals(123, table.get("abc").intValue());
        assertNull(table.get("def").intValue());
    }

    @Test
    public void testSizeIncrease() {
        HashTable<String, Integer> table = new HashTable<>(10);
        table.add("a", 1);
        table.add("b", 2);
        table.add("c", 3);
        table.add("d", 4);
        table.add("e", 5);
        table.add("f", 6);
        table.add("g", 7);
        table.add("h", 8);
        table.add("i", 9);
        table.add("j", 10);
        table.add("k", 11);
        assertEquals(11, table.size());
    }
}