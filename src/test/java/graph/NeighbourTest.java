package graph;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NeighbourTest {

    @Test
    public void testAddNeighbours() {
        int neighbourLocation = 0;
        Neighbour neighbour1 = new Neighbour(neighbourLocation);
        Neighbour neighbour2 = new Neighbour(neighbourLocation);

        neighbour1.addNeighbour(neighbour2);

        assertEquals(neighbour2, neighbour1.getNeighbours().get(0));
        assertEquals(neighbour1, neighbour2.getNeighbours().get(0));
    }
}
