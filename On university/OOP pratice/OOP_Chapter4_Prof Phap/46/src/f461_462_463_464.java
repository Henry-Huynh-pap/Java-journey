import java.util.*;

public class f461_462_463_464 {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);

        numbers.set(0, 100);

        numbers.remove(1);

        boolean found = numbers.contains(100);

        scores.put("An", 90);
        scores.remove("An");
        scores.containsKey("An");

        List<Integer> numbers =
                new ArrayList<>(List.of(5, 3, 8, 1));

        numbers.sort(Integer::compareTo);
        numbers.sort(Comparator.reverseOrder());

        String[] names = {"An", "Binh", "Cuong"};

        List<String> list =
                new ArrayList<>(Arrays.asList(names));

        String[] array = list.toArray(new String[0]);

        int[] a = {1, 2, 3, 4};

        List<Integer> list =
                Arrays.stream(a)
                        .boxed()
                        .toList();

        List<Integer> numbers =
                List.of(1, 2, 3, 4, 5, 6);

        List<Integer> even =
                numbers.stream()
                        .filter(x -> x % 2 == 0)
                        .toList();

        List<Integer> doubled =
                numbers.stream()
                        .map(x -> x * 2)
                        .toList();

        int sum =
                numbers.stream()
                        .mapToInt(Integer::intValue)
                        .sum();
    }
}
