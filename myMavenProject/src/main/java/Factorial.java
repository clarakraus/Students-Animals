public class Factorial {

    public static int factorialFor(int n) {
        var result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorialWhile(int n) {
        int result = 1;
        while (n > 0) {
            result *= n;
            --n;
        }
        return result;
    }

}
