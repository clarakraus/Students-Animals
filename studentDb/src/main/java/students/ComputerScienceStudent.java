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

Mache deine Student-Klasse zu einem Interface
Lasse zwei konkrete Klassen das Student-Interface implementieren (z.B. Informatik-/ Geschichtsstudent)
Füge eine Methode zu Student hinzu, die von den zwei implementierenden Klassen verschieden implementiert werden.
* */

import java.util.UUID;

public class ComputerScienceStudent extends Student {

    public ComputerScienceStudent(String name) {
        super(name);
    }

    @Override
    public String examinate() {
        return "programming";
    }
}