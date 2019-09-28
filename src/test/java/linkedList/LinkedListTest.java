package linkedList;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListTest {

    @Test
    public void testGetNode() throws Exception {
        LinkedList linkedList = new LinkedList();
        linkedList.addNode("one");
        linkedList.addNode("two");
        linkedList.addNode("three");

        String nodeOne = (String) linkedList.getNode(0);
        String nodeTwo = (String) linkedList.getNode(1);
        String nodeThree = (String) linkedList.getNode(2);

        assertEquals("one", nodeOne);
        assertEquals("two", nodeTwo);
        assertEquals("three", nodeThree);
    }

    @Test
    public void testAddNode() throws Exception {
        LinkedList linkedList = new LinkedList();
        linkedList.addNode("Some data");
        linkedList.addNode("Some more data");
        assertEquals(2, linkedList.size());
    }

    @Test
    public void testAddNodeAtIndex() throws Exception {
        LinkedList linkedList = new LinkedList();
        linkedList.addNode("one");
        linkedList.addNode("two");
        linkedList.addNode("three");
        linkedList.addNode("four", 1);

        String expected = "[one][four][two][three]";
        assertEquals(expected, linkedList.toString());

        // with root
        assertEquals(4, linkedList.size());
    }

    @Test
    public void testRemoveNode() throws Exception {
        LinkedList newLinkedList = new LinkedList();
        newLinkedList.addNode("one");
        newLinkedList.addNode("two");
        newLinkedList.addNode("three");
        newLinkedList.addNode("four");

        assertEquals(4, newLinkedList.size());

        newLinkedList.removeNode(1);
        String expected = "[one][three][four]";
        assertEquals(expected, newLinkedList.toString());
        assertEquals(3, newLinkedList.size());

        newLinkedList.removeNode(2);

        expected = "[one][three]";
        assertEquals(expected, newLinkedList.toString());
        assertEquals(2, newLinkedList.size());
    }

    @Test
    public void testFindMiddle() throws Exception {
        LinkedList newLinkedList = new LinkedList();
        newLinkedList.addNode("one");
        newLinkedList.addNode("two");
        newLinkedList.addNode("three");
        newLinkedList.addNode("four");
        newLinkedList.addNode("middle");
        newLinkedList.addNode("six");
        newLinkedList.addNode("seven");
        newLinkedList.addNode("eight");
        newLinkedList.addNode("nine");

        assertEquals("middle", newLinkedList.findMiddle().getData());

        newLinkedList.addNode("ten");
        assertEquals("middle", newLinkedList.findMiddle().getData());

        newLinkedList.addNode("eleven");
        assertEquals("six", newLinkedList.findMiddle().getData());
    }

}