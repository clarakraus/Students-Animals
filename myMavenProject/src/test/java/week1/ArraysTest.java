package week1;

import org.junit.jupiter.api.Test;
import week1.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTest {

    @Test
    void shouldCreateEmptyArray() {
        String[] expected = new String[0];
        assertArrayEquals(expected, Arrays.createStudents(0));
    }

    @Test
    void shouldCreateEmptyArrayForNegativeNumber() {
        String[] expected = new String[0];
        assertArrayEquals(expected, Arrays.createStudents(-1));
    }

    @Test
    void shouldCreateMultipleStudents() {
        String[] expected = {"week2.sub.Student 1", "week2.sub.Student 2", "week2.sub.Student 3"};
        assertArrayEquals(expected, Arrays.createStudents(3));
    }

}