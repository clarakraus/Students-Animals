package wiederholung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {
    @Test

    void shouldReturnOttoForIndex2(){
        //given
        Student stud1 = new Student("Anna");
        Student stud2 = new Student("Karl");
        Student stud3 = new Student("Otto");
        Student[] testStudArray = {stud1, stud2, stud3};
        StudentDB testDB = new StudentDB(testStudArray);
        //when
        String expected = "Otto";
        String actual = testDB.getStudentName(2);
        //then
        assertEquals(actual, expected);

    }

}