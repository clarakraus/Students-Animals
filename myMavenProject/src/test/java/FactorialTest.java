import org.junit.jupiter.api.Test;

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

}