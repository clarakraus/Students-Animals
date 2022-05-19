import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTest {

    @Test
    void shouldCreateEmptyArray() {
        String[] expected = new String[0];
        assertArrayEquals(expected, Arrays.createStudents(0));
    }

    @Test
    void shouldCreateMultipleStudents() {
        String[] expected = {"Student 0", "Student 1", "Student 2"};
        assertArrayEquals(expected, Arrays.createStudents(3));
    }

}