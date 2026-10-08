import java.util.ArrayList;
import java.util.List;

public class Generic441 {
    public static void main(String[] args){

        List<String> names = new ArrayList<>();

        names.add("An");
        names.add("Binh");

        for(String name : names){
            System.out.println(name);
        }


            print(10);
            print("Java");
            print(3.14);

    }

    public static <T> void print(T value){
        System.out.println(value);

    }
}
