package week2.randomstudent;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        Assertions.assertEquals("[{name: André Schreck}, {name: Thomas Kittlaus}]", actual);
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
        Assertions.assertEquals(2, actual.length);
        Assertions.assertEquals("André Schreck", actual[0].getName());
        Assertions.assertEquals("Thomas Kittlaus", actual[1].getName());
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
        Assertions.assertEquals(1, actual.length);
        Assertions.assertEquals("Thomas Kittlaus", actual[0].getName());
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
        Assertions.assertEquals(1, actual.length);
        Assertions.assertEquals("André Schreck", actual[0].getName());
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
        Assertions.assertEquals(2, actual.length);
        Assertions.assertEquals("André Schreck", actual[0].getName());
        Assertions.assertEquals("Thomas Kittlaus", actual[1].getName());
    }

}