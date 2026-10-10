import java.util.*;

public class SetHashSetLinkedHashSetTreeSet454 {
    public static void main(String[] args){
        Set<Integer> h = new HashSet<>();
        h.add(30);
        h.add(10);
        h.add(30);

        System.out.println(h);

        Set<Integer> lh = new LinkedHashSet<>();
        lh.add(30);
        lh.add(10);
        lh.add(20);

        System.out.println(lh);

        Set<Integer> t = new TreeSet<>();
        t.add(30);
        t.add(10);
        t.add(20);

        System.out.println(t);

    }
}
