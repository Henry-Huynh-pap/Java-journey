import java.util.*;

public class a86 {

    public static void main(String[] args) {

        List<String> languages = List.of(
                "Java", "Python", "Java",
                "C++", "Python", "JavaScript"
        );

        Set<String> hashSet =
                new HashSet<>(languages);

        Set<String> linkedHashSet =
                new LinkedHashSet<>(languages);

        Set<String> treeSet =
                new TreeSet<>(languages);

        System.out.println("List: " + languages);
        System.out.println("HashSet: " + hashSet);
        System.out.println(
                "LinkedHashSet: " + linkedHashSet
        );
        System.out.println("TreeSet: " + treeSet);
    }
}