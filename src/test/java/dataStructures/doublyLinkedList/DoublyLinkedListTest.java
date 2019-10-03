package dataStructures.doublyLinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class DoublyLinkedListTest {
    @Test
    public void testGetNode() throws Exception {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addNode("one");
        doublyLinkedList.addNode("two");
        doublyLinkedList.addNode("three");

        assertEquals("one", doublyLinkedList.getNode(0).getData());
        assertEquals("two", doublyLinkedList.getNode(1).getData());
        assertEquals("three", doublyLinkedList.getNode(2).getData());
    }

    @Test
    public void testAddNode() throws Exception {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.addNode("Some data");
        assertNull(doublyLinkedList.getNode(0).getNext());

        doublyLinkedList.addNode("Some more data");
        assertEquals(2, doublyLinkedList.size());
        assertEquals(doublyLinkedList.getNode(0), doublyLinkedList.getNode(1).getPrevious());
        assertEquals(doublyLinkedList.getNode(1), doublyLinkedList.getNode(0).getNext());
    }

    @Test
    public void testAddNodeAtIndex() throws Exception {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.addNode("one");
        assertEquals("one", doublyLinkedList.getNode(0).getData());

        doublyLinkedList.addNode("two");
        assertEquals("two", doublyLinkedList.getNode(1).getData());
        assertEquals("one", doublyLinkedList.getNode(1).getPrevious().getData());
        assertEquals("two", doublyLinkedList.getNode(0).getNext().getData());

        doublyLinkedList.addNode("three");
        assertEquals("two", doublyLinkedList.getNode(2).getPrevious().getData());
        assertEquals("three", doublyLinkedList.getNode(1).getNext().getData());

        doublyLinkedList.addNode("four", 1);
        assertEquals("four", doublyLinkedList.getNode(0).getNext().getData());
        assertEquals("four", doublyLinkedList.getNode(2).getPrevious().getData());
        assertEquals("two", doublyLinkedList.getNode(1).getNext().getData());

        String expected = "[one][four][two][three]";
        assertEquals(expected, doublyLinkedList.toString());

        // with root
        assertEquals(4, doublyLinkedList.size());
    }

    @Test
    public void testRemoveNode() throws Exception {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addNode("one");
        doublyLinkedList.addNode("two");
        doublyLinkedList.addNode("three");
        doublyLinkedList.addNode("four");

        assertEquals(4, doublyLinkedList.size());

        doublyLinkedList.removeNode(1);
        assertEquals("one", doublyLinkedList.getNode(1).getPrevious().getData());
        assertEquals("four", doublyLinkedList.getNode(1).getNext().getData());
        assertEquals("three", doublyLinkedList.getNode(0).getNext().getData());
        assertEquals("three", doublyLinkedList.getNode(2).getPrevious().getData());
        String expected = "[one][three][four]";
        assertEquals(expected, doublyLinkedList.toString());
        assertEquals(3, doublyLinkedList.size());

        doublyLinkedList.removeNode(1);
        assertEquals("four", doublyLinkedList.getNode(0).getNext().getData());
        assertEquals("one", doublyLinkedList.getNode(1).getPrevious().getData());
        expected = "[one][four]";
        assertEquals(expected, doublyLinkedList.toString());
        assertEquals(2, doublyLinkedList.size());
    }

    @Test
    public void testFindMiddle() throws Exception {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addNode("one");
        doublyLinkedList.addNode("two");
        doublyLinkedList.addNode("three");
        doublyLinkedList.addNode("four");
        doublyLinkedList.addNode("middle");
        doublyLinkedList.addNode("six");
        doublyLinkedList.addNode("seven");
        doublyLinkedList.addNode("eight");
        doublyLinkedList.addNode("nine");

        assertEquals("middle", doublyLinkedList.findMiddle().getData());

        doublyLinkedList.addNode("ten");
        assertEquals("middle", doublyLinkedList.findMiddle().getData());

        doublyLinkedList.addNode("eleven");
        assertEquals("six", doublyLinkedList.findMiddle().getData());
    }

    @Test
    public void testReverse() throws Exception {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addNode("one");
        doublyLinkedList.addNode("two");
        doublyLinkedList.addNode("three");
        doublyLinkedList.addNode("four");
        doublyLinkedList.addNode("five");
        doublyLinkedList.addNode("six");
        doublyLinkedList.addNode("seven");
        doublyLinkedList.addNode("eight");
        doublyLinkedList.addNode("nine");

        doublyLinkedList.reverse();

        assertEquals("nine", doublyLinkedList.getNode(0).getData());
        assertEquals("eight", doublyLinkedList.getNode(0).getNext().getData());

        assertEquals("nine", doublyLinkedList.getNode(1).getPrevious().getData());
        assertEquals("eight", doublyLinkedList.getNode(1).getData());
        assertEquals("seven", doublyLinkedList.getNode(1).getNext().getData());

        assertEquals("eight", doublyLinkedList.getNode(2).getPrevious().getData());
        assertEquals("seven", doublyLinkedList.getNode(2).getData());
        assertEquals("six", doublyLinkedList.getNode(2).getNext().getData());

        assertEquals("seven", doublyLinkedList.getNode(3).getPrevious().getData());
        assertEquals("six", doublyLinkedList.getNode(3).getData());
        assertEquals("five", doublyLinkedList.getNode(3).getNext().getData());

        assertEquals("six", doublyLinkedList.getNode(4).getPrevious().getData());
        assertEquals("five", doublyLinkedList.getNode(4).getData());
        assertEquals("four", doublyLinkedList.getNode(4).getNext().getData());

        assertEquals("five", doublyLinkedList.getNode(5).getPrevious().getData());
        assertEquals("four", doublyLinkedList.getNode(5).getData());
        assertEquals("three", doublyLinkedList.getNode(5).getNext().getData());

        assertEquals("four", doublyLinkedList.getNode(6).getPrevious().getData());
        assertEquals("three", doublyLinkedList.getNode(6).getData());
        assertEquals("two", doublyLinkedList.getNode(6).getNext().getData());

        assertEquals("three", doublyLinkedList.getNode(7).getPrevious().getData());
        assertEquals("two", doublyLinkedList.getNode(7).getData());
        assertEquals("one", doublyLinkedList.getNode(7).getNext().getData());

        assertEquals("two", doublyLinkedList.getNode(8).getPrevious().getData());
        assertEquals("one", doublyLinkedList.getNode(8).getData());
        assertNull("one", doublyLinkedList.getNode(8).getNext());
    }
}
