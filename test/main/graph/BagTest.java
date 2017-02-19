package main.graph;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BagTest {
    private Bag<String> bag;

    @Before
    public void setup() {
        bag = new Bag<String>();
    }

    @Test
    public void testIsEmpty() {
        assertTrue(bag.isEmpty());
        bag.add("an item");
        assertFalse(bag.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(bag.size(), 0);
        bag.add("an item");
        bag.add("an item");
        bag.add("an item");
        assertEquals(bag.size(), 3);
    }

    @Test
    public void testAdd() {
        assertEquals(bag.size(), 0);
        bag.add("an item");
        assertEquals(bag.size(), 1);
    }
}