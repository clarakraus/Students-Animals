public class Alarm {

    public static String checkNumberOfCustomers(int numberOfCustomers) {
        if (numberOfCustomers > 30) {
            return "Zu viele Personen";
        }
        return "Maximale Personenzahl nicht überschritten";
    }

}
