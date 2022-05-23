package week2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StudentTest {

    @Test
    void testFirstName() {
        Student student = new Student("", "Max", "");

        Assertions.assertEquals("Max", student.getFirstname());
    }

    @Test
    void testLastName() {
        Student student = new Student("Mustermann", "", "");

        Assertions.assertEquals("Mustermann", student.getLastname());
    }

    @Test
    void testSubject() {
        Student student = new Student("", "", "Informatik");

        Assertions.assertEquals("Informatik", student.getSubject());
    }

}