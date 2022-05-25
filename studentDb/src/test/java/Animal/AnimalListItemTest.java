package Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListItemTest {

    /*
    Testen ob die add Methode Tiere dazu addiert
     */

    @Test

    void shouldaddanimaltolist(){
        //given
    AnimalList testlist = new AnimalList();
    Animal elefant = new Animal("Elefant");
    //when
        testlist.add(elefant);
        assertEquals("elefant", testlist.toString());
    }

}