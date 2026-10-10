import java.util.*;

public class four4511_12 {
    public static void main(String[] args){
        int[] a = {5, 2, 8, 1};

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        List<Integer> numbers =
                new ArrayList<>(List.of(5, 2, 8, 1));

        Collections.sort(numbers);
        Collections.reverse(numbers);
        Collections.shuffle(numbers);

        class Student implements Comparable<Student> {
            String name;
            double gpa;

            Student(String name, double gpa) {
                this.name = name;
                this.gpa = gpa;
            }

            @Override
            public int compareTo(Student other) {
                return Double.compare(this.gpa, other.gpa);
            }
        }

        students.sort(
                Comparator.comparing(s -> s.name)
        );

        students.sort(
                Comparator.comparingDouble((Student s) -> s.gpa)
                        .reversed()
        );
    }
}
