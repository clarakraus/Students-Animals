import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void testSumIterative_0() {
        assertEquals(0, Sum.sumIterative(new int[]{}));
    }

    @Test
    void testSumIterative_1() {
        assertEquals(1, Sum.sumIterative(new int[]{1}));
    }

    @Test
    void testSumIterative_2() {
        assertEquals(6, Sum.sumIterative(new int[]{1, 2, 3}));
    }

    @Test
    void testSumRecursive_0() {
        assertEquals(0, Sum.sumRecursive(new int[]{}));
    }

    @Test
    void testSumRecursive_1() {
        assertEquals(1, Sum.sumRecursive(new int[]{1}));
    }

    @Test
    void testSumRecursive_2() {
        assertEquals(6, Sum.sumRecursive(new int[]{1, 2, 3}));
    }


}