package wiederholung;

public class StudentDB {

   private Student[] studArray;
    public StudentDB(Student[] studArray) {
        this.studArray = studArray;
    }

    public Student[] getStudArray() {
        return studArray;
    }

    public String getStudentName(int index){
        return studArray[index].getName();

    }
}
