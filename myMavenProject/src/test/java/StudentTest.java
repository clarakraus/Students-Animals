import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testFirstName() {
        Student student = new Student();

        student.setFirstname("Max");

        assertEquals("Max", student.getFirstname());
    }

    @Test
    void testLastName() {
        Student student = new Student();

        student.setLastname("Mustermann");

        assertEquals("Mustermann", student.getLastname());
    }

    @Test
    void testSubject() {
        Student student = new Student();

        student.setSubject("Informatik");

        assertEquals("Informatik", student.getSubject());
    }

}