import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmWithAlarmLevelTest {

    @Test
    void testThatNumberOfPeopleIsNotYetReached_yellow() {
        assertEquals("Maximale Personenzahl nicht überschritten", AlarmWithAlarmLevel.checkNumberOfCustomers(15, "gelb"));
    }

    @Test
    void testThatNumberOfPeopleIsIsExactlyReached_yellow() {
        assertEquals("Maximale Personenzahl nicht überschritten", AlarmWithAlarmLevel.checkNumberOfCustomers(30, "gelb"));
    }

    @Test
    void testThatNumberOfPeopleIsIsTooHigh_yellow() {
        assertEquals("Zu viele Personen", AlarmWithAlarmLevel.checkNumberOfCustomers(31, "gelb"));
    }

    @Test
    void testThatNumberOfPeopleIsNotYetReached_green() {
        assertEquals("Maximale Personenzahl nicht überschritten", AlarmWithAlarmLevel.checkNumberOfCustomers(45, "grün"));
    }

    @Test
    void testThatNumberOfPeopleIsIsExactlyReached_green() {
        assertEquals("Maximale Personenzahl nicht überschritten", AlarmWithAlarmLevel.checkNumberOfCustomers(60, "grün"));
    }

    @Test
    void testThatNumberOfPeopleIsIsTooHigh_green() {
        assertEquals("Zu viele Personen", AlarmWithAlarmLevel.checkNumberOfCustomers(61, "grün"));
    }

    @Test
    void testThatNoOneIsAllowedWhenAlarmLevelIsRed() {
        assertEquals("Zu viele Personen", AlarmWithAlarmLevel.checkNumberOfCustomers(1, "rot"));
        assertEquals("Maximale Personenzahl nicht überschritten", AlarmWithAlarmLevel.checkNumberOfCustomers(0, "rot"));
    }

    @Test
    void testUnknownAlarmLevel() {
        assertEquals("unknown alarm level", AlarmWithAlarmLevel.checkNumberOfCustomers(100, "unknown"));
    }

}