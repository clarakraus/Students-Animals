public class Task4 {

    public static void main(String[] args) {
        System.out.println(printSum(add(7, 17)));
    }

    private static int add(int number1, int number2) {
        System.out.println("number1 > 100? " + (number1 > 100));
        System.out.println("number2 > 100? " + (number2 > 100));
        return number1 + number2;
    }

    private static String printSum(int sum) {
        return "Summe: " + sum;
    }

}