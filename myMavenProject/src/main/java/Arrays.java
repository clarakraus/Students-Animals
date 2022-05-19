public class Arrays {

    public static String[] createStudents(int length) {
        String[] students = new String[length];
        for (int i = 0; i < students.length; i++) {
            students[i] = "Student " + i;
        }
        return students;
    }

}
