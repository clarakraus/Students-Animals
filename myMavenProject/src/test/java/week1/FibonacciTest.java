package week1;

import org.junit.jupiter.api.Test;
import week1.Fibonacci;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void fibRecursive_0() {
        assertEquals(0, Fibonacci.fibRecursive(0));
    }

    @Test
    void fibRecursive_1() {
        assertEquals(1, Fibonacci.fibRecursive(1));
    }

    @Test
    void fibRecursive_2() {
        assertEquals(1, Fibonacci.fibRecursive(2));
    }

    @Test
    void fibRecursive_3() {
        assertEquals(2, Fibonacci.fibRecursive(3));
    }

    @Test
    void fibRecursive_9() {
        assertEquals(34, Fibonacci.fibRecursive(9));
    }

    @Test
    void fibIterative_0() {
        assertEquals(0, Fibonacci.fibIterative(0));
    }

    @Test
    void fibIterative_1() {
        assertEquals(1, Fibonacci.fibIterative(1));
    }

    @Test
    void fibIterative_2() {
        assertEquals(1, Fibonacci.fibIterative(2));
    }

    @Test
    void fibIterative_3() {
        assertEquals(2, Fibonacci.fibIterative(3));
    }

    @Test
    void fibIterative_9() {
        assertEquals(34, Fibonacci.fibIterative(9));
    }

}