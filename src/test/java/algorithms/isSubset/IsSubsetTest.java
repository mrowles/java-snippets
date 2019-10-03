package algorithms.isSubset;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IsSubsetTest {
    @Test
    public void testIsSubsetIterative() {
        int[] primary = new int[]{1};
        int[] subset = new int[]{1};
        assertTrue(IsSubset.isSubsetIterative(primary, subset));

        primary = new int[]{1, 2, 3};
        subset = new int[]{1, 3};
        assertTrue(IsSubset.isSubsetIterative(primary, subset));

        primary = new int[]{1, 2, 3, 0, 0, 0};
        subset = new int[]{0, 0, 0, 0};
        assertFalse(IsSubset.isSubsetIterative(primary, subset));
    }
}