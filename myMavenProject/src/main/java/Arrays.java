public class Arrays {

    public static String[] createStudents(int length) {
        if (length < 0) {
            return new String[0];
        }

        String[] students = new String[length];
        for (int i = 0; i < students.length; i++) {
            students[i] = "Student " + (i + 1);
        }
        return students;
    }

}
