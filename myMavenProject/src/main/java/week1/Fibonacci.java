package week1;

public class Fibonacci {

    public static int fibRecursive(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    public static int fibIterative(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int result = 0;
        int v0 = 0;
        int v1 = 1;
        for (int i = 2; i <= n; i++) {
            result = v0 + v1;
            v0 = v1;
            v1 = result;
        }
        return result;
    }

}
