package week2;

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

    @Override
    public String toString() {
        return "Student{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
