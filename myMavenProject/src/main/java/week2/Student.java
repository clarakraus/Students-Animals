package week2;

import java.util.Objects;

public class Student {

    private String lastname;
    private String firstname;
    private String subject;

    public Student(String lastname, String firstname, String subject) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.subject = subject;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSubject() {
        return subject;
    }

    public String toString() {
        return "Student{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(lastname, student.lastname) && Objects.equals(firstname, student.firstname) && Objects.equals(subject, student.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastname, firstname, subject);
    }
}
