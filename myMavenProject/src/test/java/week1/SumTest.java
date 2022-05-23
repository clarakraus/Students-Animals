package week1;

import org.junit.jupiter.api.Test;
import week1.Sum;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void testSumIterative_emptyArray() {
        assertEquals(0, Sum.sumIterative(new int[]{}));
    }

    @Test
    void testSumIterative_oneElement() {
        assertEquals(1, Sum.sumIterative(new int[]{1}));
    }

    @Test
    void testSumIterative_multipleElements() {
        assertEquals(6, Sum.sumIterative(new int[]{1, 2, 3}));
    }

    @Test
    void testSumRecursive_emptyArray() {
        assertEquals(0, Sum.sumRecursive(new int[]{}));
    }

    @Test
    void testSumRecursive_oneElement() {
        assertEquals(1, Sum.sumRecursive(new int[]{1}));
    }

    @Test
    void testSumRecursive_multipleElements() {
        assertEquals(6, Sum.sumRecursive(new int[]{1, 2, 3}));
    }


}