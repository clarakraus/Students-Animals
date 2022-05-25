package students;

import java.util.UUID;

public abstract class Student {
    private String name;
    private String id;

    public Student(String name) {
        this.name = name;
        id = UUID.randomUUID().toString();
    }
    public String getId(){
        return id;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "ID:" + id +
                " Name: " + name + " " ;
    }

    public abstract String examinate();

}
