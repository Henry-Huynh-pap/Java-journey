import java.util.*;

class Student {

    private final String name;
    private final double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return name + " - " + gpa;
    }
}

public class a88 {

    public static void main(String[] args) {

        List<Student> students =
                new ArrayList<>(List.of(
                        new Student("An", 8.5),
                        new Student("Binh", 7.0),
                        new Student("Cuong", 9.2),
                        new Student("Dung", 6.8),
                        new Student("Hoa", 8.8)
                ));

        System.out.println("Original:");
        students.forEach(System.out::println);

        students.sort(
                Comparator.comparing(Student::getName)
        );

        System.out.println("\nBy name:");
        students.forEach(System.out::println);

        students.sort(
                Comparator.comparingDouble(
                        Student::getGpa
                )
        );

        System.out.println("\nBy GPA ascending:");
        students.forEach(System.out::println);

        students.sort(
                Comparator.comparingDouble(
                        Student::getGpa
                ).reversed()
        );

        System.out.println("\nBy GPA descending:");
        students.forEach(System.out::println);

        System.out.println("\nGPA >= 8:");
        students.stream()
                .filter(s -> s.getGpa() >= 8.0)
                .forEach(System.out::println);
    }
}