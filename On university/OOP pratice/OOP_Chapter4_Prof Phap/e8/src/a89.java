import java.util.*;

public class a89 {

    public static void main(String[] args) {

        List<Integer> numbers =
                List.of(3, 8, 2, 10, 5, 7, 12, 4);

        List<Integer> even =
                numbers.stream()
                        .filter(x -> x % 2 == 0)
                        .toList();

        List<Integer> greaterThan5 =
                numbers.stream()
                        .filter(x -> x > 5)
                        .toList();

        List<Integer> squares =
                numbers.stream()
                        .map(x -> x * x)
                        .toList();

        List<Integer> sorted =
                numbers.stream()
                        .sorted()
                        .toList();

        int sum =
                numbers.stream()
                        .mapToInt(Integer::intValue)
                        .sum();

        double average =
                numbers.stream()
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0.0);

        int max =
                numbers.stream()
                        .mapToInt(Integer::intValue)
                        .max()
                        .orElseThrow();

        int min =
                numbers.stream()
                        .mapToInt(Integer::intValue)
                        .min()
                        .orElseThrow();

        System.out.println("Even = " + even);
        System.out.println(">5 = " + greaterThan5);
        System.out.println("Squares = " + squares);
        System.out.println("Sorted = " + sorted);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}