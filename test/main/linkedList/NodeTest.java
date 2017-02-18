package main.linkedList;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NodeTest {

    Node rootNode;

    @Before
    public void setUp() throws Exception {
        rootNode = new Node(1);
    }

    @Test
    public void testNextNode() {
        Node nextNode = new Node(2);
        nextNode.setData("Test");
        rootNode.setNext(nextNode);
        assertEquals(nextNode, rootNode.getNext());
        assertEquals("Test", rootNode.getNext().getData());
    }

    @Test
    public void testInsertNode() {
        Node thirdNode = new Node(3);
        Node secondNode = new Node(2, thirdNode);
        rootNode.setNext(secondNode);
        assertEquals(secondNode, rootNode.getNext());
        assertEquals(thirdNode, secondNode.getNext());
    }
}