import org.junit.jupiter.api.Test;

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
        String[] expected = {"Student 1", "Student 2", "Student 3"};
        assertArrayEquals(expected, Arrays.createStudents(3));
    }

}