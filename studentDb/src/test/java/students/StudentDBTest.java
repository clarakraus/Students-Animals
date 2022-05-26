//package students;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//class StudentDBTest {


  /*  @Test
    void shouldReturnAllStudentsWithList(){
        //GIVEN
        Student student1 = new HistoryStudent("Nicolai");
        Student student2 = new ComputerScienceStudent("Christoph");
        Student[] myTestStudents ={student1,student2};
        StudentDB testDb = new StudentDB(myTestStudents);
        //WHEN
        Student[] actual = testDb.list();
        //THEN
        assertArrayEquals(myTestStudents,actual);
    }

    @Test
    void shouldReturnString(){
        //GIVEN
        Student student1 = new HistoryStudent("Nicolai");
        Student student2 = new ComputerScienceStudent("Christoph");
        String stu1id = student1.getId();
        String stu2id = student2.getId();
        Student[] myTestStudents ={student1,student2};
        StudentDB testDb = new StudentDB(myTestStudents);
        String expected = "Unsere Schüler: [ID:"+stu1id+" Name: Nicolai , ID:"+stu2id+" Name: Christoph ]";
        //WHEN
        String actual = testDb.toString();
        //THEN
        assertEquals(expected,actual);
    }

    @Test
    void shouldAddNewStudentToDB(){
        //GIVEN
        Student student1 = new HistoryStudent("Nicolai");
        Student student2 = new ComputerScienceStudent("Christoph");
        Student student3 = new HistoryStudent("Erik");
        Student[] myTestStudents ={student1,student2};
        StudentDB testDb = new StudentDB(myTestStudents);
        //WHEN
        testDb.add(student3);
        Student[] actual = testDb.list();
        //THEN
        assertEquals(3,actual.length);
        Student newStudent = actual[2];
        assertEquals("Erik",newStudent.getName());
    }

    @Test
    void shouldRemoveStudentFromDB(){
        //GIVEN
        Student student1 = new HistoryStudent("Nicolai");
        Student student2 = new ComputerScienceStudent("Christoph");
        Student student3 = new HistoryStudent("Erik");
        String removeId = student2.getId();
        Student[] myTestStudents ={student1,student2,student3};
        StudentDB testDb = new StudentDB(myTestStudents);
        //WHEN
        testDb.remove(removeId);
        Student[] actual = testDb.list();
        //THEN
        assertEquals(2,actual.length);
        assertNotEquals("Christoph", actual[0].getName());
        assertNotEquals("Christoph", actual[1].getName());

    }

    @Test
    void shouldRemoveFirstStudentFromDB(){
        //GIVEN
        Student student1 = new HistoryStudent("Nicolai");
        Student student2 = new ComputerScienceStudent("Christoph");
        Student student3 = new HistoryStudent("Erik");
        String removeId = student1.getId();
        Student[] myTestStudents ={student1,student2,student3};
        StudentDB testDb = new StudentDB(myTestStudents);
        //WHEN
        testDb.remove(removeId);
        Student[] actual = testDb.list();
        //THEN
        assertEquals(2,actual.length);
        assertNotEquals("Nicolai", actual[0].getName());
        assertNotEquals("Nicolai", actual[1].getName());

    }

    @Test
    void shouldRemoveLastStudentFromDB(){
        //GIVEN
        Student student1 = new HistoryStudent("Nicolai");
        Student student2 = new ComputerScienceStudent("Christoph");
        Student student3 = new HistoryStudent("Erik");
        String removeId = student3.getId();
        Student[] myTestStudents ={student1,student2,student3};
        StudentDB testDb = new StudentDB(myTestStudents);
        //WHEN
        testDb.remove(removeId);
        Student[] actual = testDb.list();
        //THEN
        assertEquals(2,actual.length);
        assertNotEquals("Erik", actual[0].getName());
        assertNotEquals("Erik", actual[1].getName());

    }

    @Test
    void shouldNotRemoveStudentWithUnknownId(){
        //GIVEN
        Student student1 = new HistoryStudent("Nicolai");
        Student student2 = new ComputerScienceStudent("Christoph");
        Student student3 = new HistoryStudent("Erik");
        String removeId = "unknown";
        Student[] myTestStudents ={student1,student2,student3};
        StudentDB testDb = new StudentDB(myTestStudents);
        //WHEN
        testDb.remove(removeId);
        Student[] actual = testDb.list();
        //THEN
        assertEquals(3,actual.length);

    } */
   /* @Test

    void shouldReturnRunTimeException(){

        Student student1 = new HistoryStudent("Karl");
        List<Student> testList = new ArrayList<>(List.of(student1));
        StudentDB testDB = new StudentDB(testList);
        try{
            testDB.add(student1);
            fail();
        }catch (RuntimeException e){
        }
    }

} */