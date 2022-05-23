package week1;

import org.junit.jupiter.api.Test;
import week1.Factorial;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void testFacFor_0() {
        assertEquals(1, Factorial.factorialFor(0));
    }

    @Test
    void testFacFor_1() {
        assertEquals(1, Factorial.factorialFor(1));
    }

    @Test
    void testFacFor_2() {
        assertEquals(2, Factorial.factorialFor(2));
    }

    @Test
    void testFacFor_3() {
        assertEquals(6, Factorial.factorialFor(3));
    }

    @Test
    void testFacWhile_0() {
        assertEquals(1, Factorial.factorialWhile(0));
    }

    @Test
    void testFacWhile_1() {
        assertEquals(1, Factorial.factorialWhile(1));
    }

    @Test
    void testFacWhile_2() {
        assertEquals(2, Factorial.factorialWhile(2));
    }

    @Test
    void testFacWhile_3() {
        assertEquals(6, Factorial.factorialWhile(3));
    }

    @Test
    void testFacRecursive_0() {
        assertEquals(1, Factorial.factorialRecursive(0));
    }

    @Test
    void testFacRecursive_1() {
        assertEquals(1, Factorial.factorialRecursive(1));
    }

    @Test
    void testFacRecursive_2() {
        assertEquals(2, Factorial.factorialRecursive(2));
    }

    @Test
    void testFacRecursive_3() {
        assertEquals(6, Factorial.factorialRecursive(3));
    }

}