package week1;

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

    public static int factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        }
        return factorialRecursive(n - 1) * n;
    }

}
