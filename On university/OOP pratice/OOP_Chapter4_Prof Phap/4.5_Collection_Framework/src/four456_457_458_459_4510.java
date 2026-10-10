import java.util.*;

public class four456_457_458_459_4510 {
    public static void main(String[] args){
        Map<String, Integer> scores = new HashMap<>();

        scores.put("An", 90);
        scores.put("Binh", 85);
        scores.put("Cuong", 95);

        System.out.println(scores.get("An"));
        System.out.println(scores.containsKey("Binh"));

        Map<String, Integer> h = new HashMap<>();

        Map<String, Integer> lh = new LinkedHashMap<>();

        Map<String, Integer> t = new TreeMap<>();

        NavigableMap<Integer, String> map = new TreeMap<>();

        map.put(10, "A");
        map.put(20, "B");
        map.put(30, "C");

        System.out.println(map.lowerKey(20));
        System.out.println(map.floorKey(20));
        System.out.println(map.ceilingKey(20));
        System.out.println(map.higherKey(20));

        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop());

        List<String> names =
                new ArrayList<>(List.of("An", "Binh", "Cuong"));

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        ListIterator<String> li = names.listIterator();

        while (li.hasNext()) {
            System.out.println(li.next());
        }

        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}
