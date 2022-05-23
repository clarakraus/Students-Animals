package students;

/*
Erstelle eine Klasse StudentDB mit folgenden Eigenschaften

Der Konstruktor nimmt ein Array von Studenten entgegen
Jeder Student hat einen Namen und eine Id

Die Methode list gibt alle Studenten zurück
Die Methode toString() gibt alle Studenten formatiert als String zurück
Die Methode randomStudent() gibt einen zufälligen Studenten zurück (Nutze für den Zufall Math.random())
Schreibe für alle Methoden Tests (bis auf randomStudent() )

Bonus:

Schreibe eine add und eine remove Methode, um Studenten hinzuzufügen und zu entfernen
Schaue dir records an und mach aus deinem Studenten ein record
* */

import java.util.UUID;

public class Student {

    private String name;
    private String id;

    public Student(String name) {
        this.name = name;
        id = UUID.randomUUID().toString();
    }

    public String getId() {
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
}
