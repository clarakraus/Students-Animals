public class StringChecker {

    public static void main(String[] args) {
        System.out.println(checkString("Hallo"));
        System.out.println(checkString("Hallo ziemlich langer String"));
        System.out.println(checkString("Hallo ziemlich langer fancy String"));
    }

    public static boolean checkString(String s) {
        return determineStringLength(s) && checkIfFancy(s);
    }

    private static boolean checkIfFancy(String s) {
        return s.contains("fancy");
    }

    private static boolean determineStringLength(String s) {
        return s.length() > 20;
    }

}
