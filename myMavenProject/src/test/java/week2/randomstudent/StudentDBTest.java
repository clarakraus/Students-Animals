package week2.randomstudent;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentDBTest {

    @Test
    void shouldMakeSureThatStudentsCanBeRetrieved() {
        // given
        Student[] students = { new Student("André Schreck"), new Student("Thomas Kittlaus") };
        StudentDB studentDB = new StudentDB(students);

        // when
        Student[] actual = studentDB.list();

        // then
        Assertions.assertArrayEquals(students, actual);
    }

    @Test
    void shouldReturnRandomStudent() {
        // given
        Student[] students = { new Student("André Schreck"), new Student("Thomas Kittlaus") };
        StudentDB studentDB = new StudentDB(students);

        // when
        Student student = studentDB.randomStudent();

        // then
        Assertions.assertNotNull(student);
    }

    @Test
    void shouldReturnStringRepresentation() {
        // given
        Student[] students = { new Student("André Schreck"), new Student("Thomas Kittlaus") };
        StudentDB studentDB = new StudentDB(students);

        // when
        String actual = studentDB.toString();

        // then
        assertEquals("[{name: André Schreck}, {name: Thomas Kittlaus}]", actual);
    }

    @Test
    void shouldAddNewStudent() {
        // given
        Student[] students = { new Student("André Schreck") };
        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.add(new Student("Thomas Kittlaus"));
        Student[] actual = studentDB.list();

        // then
        assertEquals(2, actual.length);
        assertEquals("André Schreck", actual[0].getName());
        assertEquals("Thomas Kittlaus", actual[1].getName());
    }

    @Test
    void shouldRemoveFirstStudent() {
        // given
        Student[] students = { new Student("André Schreck"), new Student("Thomas Kittlaus") };
        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.remove(0);
        Student[] actual = studentDB.list();

        // then
        assertEquals(1, actual.length);
        assertEquals("Thomas Kittlaus", actual[0].getName());
    }

    @Test
    void shouldRemoveLastStudent() {
        // given
        Student[] students = { new Student("André Schreck"), new Student("Thomas Kittlaus") };
        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.remove(1);
        Student[] actual = studentDB.list();

        // then
        // then
        assertEquals(1, actual.length);
        assertEquals("André Schreck", actual[0].getName());
    }

    @Test
    void shouldRemoveIntermediateStudent() {
        // given
        Student[] students = { new Student("André Schreck"), new Student("Max Mustermann"), new Student("Thomas Kittlaus") };
        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.remove(1);
        Student[] actual = studentDB.list();

        // then
        assertEquals(2, actual.length);
        assertEquals("André Schreck", actual[0].getName());
        assertEquals("Thomas Kittlaus", actual[1].getName());
    }

}