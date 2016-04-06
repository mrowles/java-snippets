package BinaryTree.test;

import static org.junit.Assert.assertEquals;

import BinaryTree.main.Node;
import org.junit.Before;
import org.junit.Test;

public class NodeTest {

    Node newNode;

    @Before
    public void setUp() throws Exception {
        newNode = new Node(50, "Boss");
    }

    @Test
    public void testToString() {
        assertEquals("Boss : 50 ", newNode.toString());
    }

}