package wiederholung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchülerTest {

    @Test
    void shouldgetName() {
        //given
        Schüler schüler1 = new Schüler("Otto", 12, "Schokolade");
        String actual = schüler1.getName();
        assertEquals("Otto", actual);

    }


    @Test
    void getAge() {
        Schüler schüler1 = new Schüler("Otto", 12, "Schokolade");
        int actual = schüler1.getAge();
        assertEquals(12, actual);
    }

    @Test
    void getFavoriteIceCream() {
        Schüler schüler1 = new Schüler("Otto", 12, "Schokolade");
        String actual = schüler1.getFavoriteIceCream();
        assertEquals("Schokolade", actual);
    }
    @Test

    void shouldReturnAllAttributesAsString(){
        Schüler schüler1 = new Schüler("Otto", 12, "Schokolade");
        String actual = schüler1.toString();
        assertEquals("name=Otto, age=12, favoriteIceCream=Schokolade", actual);
    }
}