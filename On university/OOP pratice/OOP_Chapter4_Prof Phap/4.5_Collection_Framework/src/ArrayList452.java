import java.util.ArrayList;
import java.util.List;

public class ArrayList452 {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers);
        System.out.println(numbers.get(0));

        numbers.set(0, 100);
        numbers.remove(1);
    }
}
