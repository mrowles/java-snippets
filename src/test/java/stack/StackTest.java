package stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import stack.Stack;
import org.junit.Before;
import org.junit.Test;

public class StackTest {

    private Stack<String> stack;

    @Before
    public void setup() {
        stack = new Stack<String>();
        stack.push("First in");
        stack.push("second in");
        stack.push("Third in");
        stack.push("Fourth in");
        stack.push("Fifth in");
    }

    @Test
    public void testIsEmpty() {
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(stack.size(), 5);
    }

    @Test
    public void testPush() {
        assertEquals(stack.size(), 5);
        assertEquals(stack.peek(), "Fifth in");

        stack.push("Sixth in");

        assertEquals(stack.size(), 6);
        assertEquals(stack.peek(), "Sixth in");
    }

    @Test
    public void testPop() {
        assertEquals(stack.size(), 5);
        assertEquals(stack.peek(), "Fifth in");

        stack.pop();

        assertEquals(stack.size(), 4);
        assertEquals(stack.peek(), "Fourth in");
    }

    @Test
    public void testToString() {
        assertEquals(stack.toString(), "Fifth in Fourth in Third in second in First in ");
    }

}