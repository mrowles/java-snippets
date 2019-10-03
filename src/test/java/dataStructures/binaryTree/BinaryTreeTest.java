package dataStructures.binaryTree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest {

    private BinaryTree binaryTree;
    private String expectedOutput;

    @Before
    public void setUp() throws Exception {
        binaryTree = new BinaryTree();
        binaryTree.addNode(50, "Boss");
        binaryTree.addNode(25, "Vice President");
        binaryTree.addNode(15, "Office Manager");
        binaryTree.addNode(30, "Secretary");
        binaryTree.addNode(31, "Executive Assistant");
        binaryTree.addNode(29, "Janitor");
        binaryTree.addNode(75, "Sales Manager");
        binaryTree.addNode(85, "Salesman 1");

        expectedOutput = "";
    }

    @Test
    public void testPreOrderTraverseTree() throws Exception {
        expectedOutput += "Boss : 50 ";
        expectedOutput += "Vice President : 25 ";
        expectedOutput += "Office Manager : 15 ";
        expectedOutput += "Secretary : 30 ";
        expectedOutput += "Janitor : 29 ";
        expectedOutput += "Executive Assistant : 31 ";
        expectedOutput += "Sales Manager : 75 ";
        expectedOutput += "Salesman 1 : 85 ";

        assertEquals(expectedOutput, binaryTree.preOrderTraversal(binaryTree.root));
    }

    @Test
    public void testInOrderTraverseTree() throws Exception {
        expectedOutput += "Office Manager : 15 ";
        expectedOutput += "Vice President : 25 ";
        expectedOutput += "Janitor : 29 ";
        expectedOutput += "Secretary : 30 ";
        expectedOutput += "Executive Assistant : 31 ";
        expectedOutput += "Boss : 50 ";
        expectedOutput += "Sales Manager : 75 ";
        expectedOutput += "Salesman 1 : 85 ";

        assertEquals(expectedOutput, binaryTree.inOrderTraversal(binaryTree.root));
    }

    @Test
    public void testPostOrderTraverseTree() throws Exception {
        expectedOutput += "Office Manager : 15 ";
        expectedOutput += "Janitor : 29 ";
        expectedOutput += "Executive Assistant : 31 ";
        expectedOutput += "Secretary : 30 ";
        expectedOutput += "Vice President : 25 ";
        expectedOutput += "Salesman 1 : 85 ";
        expectedOutput += "Sales Manager : 75 ";
        expectedOutput += "Boss : 50 ";

        assertEquals(expectedOutput, binaryTree.postOrderTraversal(binaryTree.root));
    }
}