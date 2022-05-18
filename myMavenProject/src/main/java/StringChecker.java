public class StringChecker {

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
