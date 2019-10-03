package algorithms.squareRoot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquareRootTest {

    @Test
    public void getSquareRoot() {
        assertEquals(4.0, SquareRoot.getSquareRoot(16), 0);
        assertEquals(10.0, SquareRoot.getSquareRoot(100), 0);
        assertEquals(64.0, SquareRoot.getSquareRoot(4096), 0);
        assertEquals(100.0, SquareRoot.getSquareRoot(10000), 0);
    }
}