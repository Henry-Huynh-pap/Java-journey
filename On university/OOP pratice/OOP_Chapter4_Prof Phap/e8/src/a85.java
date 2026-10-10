import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class a85 {

    public static void main(String[] args) {

        List<Integer> numbers =
                new ArrayList<>(
                        List.of(10, 5, 20, 15, 5, 30)
                );

        numbers.add(40);

        numbers.remove(Integer.valueOf(5));

        int index = numbers.indexOf(20);
        if (index >= 0) {
            numbers.set(index, 25);
        }

        System.out.println(
                "Contains 15: " + numbers.contains(15)
        );

        System.out.println(
                "Size: " + numbers.size()
        );

        System.out.println(
                "Max: " + numbers.stream()
                        .max(Integer::compareTo)
                        .orElseThrow()
        );

        numbers.sort(Comparator.naturalOrder());
        System.out.println("Ascending: " + numbers);

        numbers.sort(Comparator.reverseOrder());
        System.out.println("Descending: " + numbers);
    }
}