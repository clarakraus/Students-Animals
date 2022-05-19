public class Sum {

    public static int sumIterative(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static int sumRecursive(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        return sumRecursiveInternal(numbers, 0, numbers.length);
    }

    private static int sumRecursiveInternal(int[] numbers, int start, int end) {
        if (start == end - 1) {
            return numbers[start];
        }
        return sumRecursiveInternal(numbers, start, start + (end - start) / 2)
                + sumRecursiveInternal(numbers, start + ((end - start) / 2), end);
    }

}
