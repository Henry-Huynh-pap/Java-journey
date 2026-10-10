import java.util.*;

public class a87 {

    public static void main(String[] args) {

        Map<String, Double> scores =
                new HashMap<>();

        scores.put("An", 8.5);
        scores.put("Binh", 7.0);
        scores.put("Cuong", 9.2);
        scores.put("Dung", 6.8);

        scores.put("Binh", 7.5);

        System.out.println(
                "Score of An = " + scores.get("An")
        );

        System.out.println(
                "Has An = " + scores.containsKey("An")
        );

        scores.remove("Dung");

        for (Map.Entry<String, Double> entry
                : scores.entrySet()) {

            System.out.println(
                    entry.getKey() + " -> "
                            + entry.getValue()
            );
        }

        Map.Entry<String, Double> best =
                scores.entrySet()
                        .stream()
                        .max(Map.Entry.comparingByValue())
                        .orElseThrow();

        System.out.println(
                "Best = " + best.getKey()
                        + ", GPA = " + best.getValue()
        );
    }
}