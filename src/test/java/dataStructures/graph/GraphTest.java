package dataStructures.graph;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class GraphTest {

    private Graph graph;

    @Before
    public void setup() {
        graph = new Graph(10);
        graph.addEdge(1, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
    }

    @Test
    public void testVertices() {
        assertEquals(graph.vertices(), 10);
    }

    @Test
    public void testEdges() {
        assertEquals(graph.edges(), 8);
    }

    @Test
    public void testAddEdge() {
        graph.addEdge(5, 1);

        assertEquals(graph.vertices(), 10);
        assertEquals(graph.edges(), 9);
    }

    @Test
    public void testDegree() {
        assertEquals(graph.degree(1), 8);
        assertEquals(graph.degree(2), 7);
    }

    @Test
    public void testToString() {
        String expectedResult = "10 vertices, 8 edges = " +
                "0:  | " +
                "1: 3, 2, 2, 2, 2, 2, 2, 2,  | " +
                "2: 1, 1, 1, 1, 1, 1, 1,  | " +
                "3: 1,  | " +
                "4:  | " +
                "5:  | " +
                "6:  | " +
                "7:  | " +
                "8:  | " +
                "9:  | ";


        assertThat(graph.toString(), is(expectedResult));
    }
}