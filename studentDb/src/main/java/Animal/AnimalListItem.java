package Animal;
/*
Schreibe eine Klasse AnimalListItem mit

einer Variable value vom Typ Animal
einer Variable next vom Typ AnimalListItem
einem Konstruktor mit value als Parameter
 */

public class AnimalListItem {
    private Animal value;
    private AnimalListItem next;

    public AnimalListItem(Animal value) {
        this.value = value;
    }

    public Animal getValue() {
        return value;
    }

    public void setNext(AnimalListItem next) {
        this.next = next;
    }

    public AnimalListItem getNext() {
        return next;
    }
}
