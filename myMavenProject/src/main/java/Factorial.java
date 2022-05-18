public class Factorial {

    public static int factorialFor(int n) {
        var result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
