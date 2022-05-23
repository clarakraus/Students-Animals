package week1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AlarmTest {

    @Test
    void shouldHaveTooManyCustomers() {
        int numberOfCustomers = 31;

        String actual = Alarm.checkNumberOfCustomers(numberOfCustomers);

        Assertions.assertEquals("Zu viele Personen", actual);
    }

    @Test
    void shouldBeValid() {
        int numberOfCustomers = 30;

        String actual = Alarm.checkNumberOfCustomers(numberOfCustomers);

        Assertions.assertEquals("Maximale Personenzahl nicht überschritten", actual);
    }

}