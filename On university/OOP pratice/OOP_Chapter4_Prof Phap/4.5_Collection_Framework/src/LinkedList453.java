import java.util.LinkedList;

public class LinkedList453 {
    public static void main(String[] args){
        LinkedList<String> names = new LinkedList<>();

        names.add("An");
        names.add("Binh");
        names.addFirst("Lan");
        names.addLast("Nam");

        System.out.println(names);
    }
}
