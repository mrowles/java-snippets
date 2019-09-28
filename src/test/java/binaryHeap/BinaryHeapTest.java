package binaryHeap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BinaryHeapTest {

    private BinaryHeap binaryHeap;

    @Before
    public void setup() {
        binaryHeap = new BinaryHeap(10);
        binaryHeap.insert(70);
        binaryHeap.insert(10);
        binaryHeap.insert(30);
        binaryHeap.insert(80);
        binaryHeap.insert(60);
        binaryHeap.insert(20);
        binaryHeap.insert(40);
        binaryHeap.insert(50);

    }

    @Test
    public void testIsEmpty() {
        assertFalse(binaryHeap.isEmpty());
    }

    @Test
    public void testIsFull() {
        assertFalse(binaryHeap.isFull());
        binaryHeap.insert(90);
        assertTrue(binaryHeap.isFull());
    }

    @Test
    public void testMakeEmpty() {
        binaryHeap.insert(90);

        assertFalse(binaryHeap.isEmpty());
        assertTrue(binaryHeap.isFull());

        binaryHeap.makeEmpty();

        assertTrue(binaryHeap.isEmpty());
        assertFalse(binaryHeap.isFull());
    }

    @Test
    public void testInsert() {
        assertFalse(binaryHeap.isFull());
        binaryHeap.insert(200);
        assertTrue(binaryHeap.isFull());
    }

    @Test
    public void testFindMind() {
        assertEquals(binaryHeap.findMin(), 10);
    }

    @Test
    public void testDeleteMin() {
        assertEquals(binaryHeap.findMin(), 10);
        binaryHeap.deleteMin();
        assertEquals(binaryHeap.findMin(), 20);
    }

    @Test
    public void testDelete() {
        assertEquals(binaryHeap.findMin(), 10);
        binaryHeap.delete(0);
        assertEquals(binaryHeap.findMin(), 20);
    }

    @Test
    public void testPrintHeap() {
        assertEquals("10 70 30 80 60 20 40 50 ", binaryHeap.toString());
    }


}