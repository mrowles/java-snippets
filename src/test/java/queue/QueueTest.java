package queue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import queue.Queue;
import org.junit.Before;
import org.junit.Test;

public class QueueTest {

    private Queue<String> queue;

    @Before
    public void setup() {
        queue = new Queue<String>();
        queue.enqueue("First in");
        queue.enqueue("Second in");
        queue.enqueue("Third in");
        queue.enqueue("Fourth in");
        queue.enqueue("Fifth in");
    }

    @Test
    public void testIsEmpty() {
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(queue.size(), 5);
    }

    @Test
    public void testPeek() {
        assertEquals(queue.peek(), "First in");
    }

    @Test
    public void testEnqueue() {
        assertEquals(queue.size(), 5);

        queue.enqueue("Sixth in");

        assertEquals(queue.size(), 6);
    }

    @Test
    public void testDequeue() {
        assertEquals(queue.size(), 5);

        queue.enqueue("Sixth in");

        assertEquals(queue.size(), 6);
        assertEquals(queue.peek(), "First in");

        queue.dequeue();

        assertEquals(queue.size(), 5);
        assertEquals(queue.peek(), "Second in");
    }

    @Test
    public void testToString() {
        assertEquals(queue.toString(), "First in Second in Third in Fourth in Fifth in ");
    }
}