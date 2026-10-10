public class a82 {

    public static int sum(int[] a) {
        int result = 0;
        for (int x : a) {
            result += x;
        }
        return result;
    }

    public static double average(int[] a) {
        if (a.length == 0) {
            return 0.0;
        }
        return (double) sum(a) / a.length;
    }

    public static int max(int[] a) {
        if (a.length == 0) {
            throw new IllegalArgumentException(
                    "Array must not be empty"
            );
        }

        int result = a[0];

        for (int x : a) {
            if (x > result) {
                result = x;
            }
        }
        return result;
    }

    public static int min(int[] a) {
        if (a.length == 0) {
            throw new IllegalArgumentException(
                    "Array must not be empty"
            );
        }

        int result = a[0];

        for (int x : a) {
            if (x < result) {
                result = x;
            }
        }
        return result;
    }

    public static int countEven(int[] a) {
        int count = 0;

        for (int x : a) {
            if (x % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int countGreaterThan10(int[] a) {
        int count = 0;

        for (int x : a) {
            if (x > 10) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 5, 8, 20, 3, 15, 7};

        System.out.println("Sum = " + sum(numbers));
        System.out.println("Average = " + average(numbers));
        System.out.println("Max = " + max(numbers));
        System.out.println("Min = " + min(numbers));
        System.out.println("Even = " + countEven(numbers));
        System.out.println(">10 = " +
                countGreaterThan10(numbers));
    }
}