package main.doublyLinkedList;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NodeTest {

    @Test
    public void testNextNode() {
        Node rootNode = new Node(1);
        Node nextNode = new Node(2);

        nextNode.setData("Test");
        rootNode.setNext(nextNode);
        assertEquals(nextNode, rootNode.getNext());
        assertEquals("Test", rootNode.getNext().getData());
    }

    @Test
    public void testPrevioustNode() {
        Node rootNode = new Node(1);
        Node nextNode = new Node(2);

        rootNode.setNext(nextNode);

        nextNode.setData("Test");
        nextNode.setPrevious(rootNode);
        assertEquals(rootNode, nextNode.getPrevious());
        assertEquals("Test", rootNode.getNext().getData());
    }

    @Test
    public void testInsertNode() {
        Node rootNode = new Node(1);
        Node thirdNode = new Node(3);
        Node secondNode = new Node(2, rootNode, thirdNode);

        rootNode.setNext(secondNode);
        thirdNode.setPrevious(secondNode);
        assertEquals(secondNode, rootNode.getNext());
        assertEquals(thirdNode, secondNode.getNext());
        assertEquals(rootNode, secondNode.getPrevious());
        assertEquals(secondNode, thirdNode.getPrevious());
    }
}
