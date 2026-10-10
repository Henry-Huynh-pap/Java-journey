import java.util.*;

public class StudentManager {

    private final List<Student> students =
            new ArrayList<>();

    public boolean add(Student student) {

        if (findById(student.getId()).isPresent()) {
            return false;
        }

        students.add(student);
        return true;
    }

    public boolean remove(String id) {

        return students.removeIf(
                s -> s.getId().equals(id)
        );
    }

    public Optional<Student> findById(String id) {

        return students.stream()
                .filter(
                        s -> s.getId().equals(id)
                )
                .findFirst();
    }

    public List<Student> findByName(String keyword) {

        String k = keyword.toLowerCase();

        return students.stream()
                .filter(
                        s -> s.getName()
                                .toLowerCase()
                                .contains(k)
                )
                .toList();
    }

    public void printAll() {

        students.forEach(
                System.out::println
        );
    }

    public Optional<Student> bestStudent() {

        return students.stream()
                .max(
                        Comparator.comparingDouble(
                                Student::getGpa
                        )
                );
    }

    public double averageGpa() {

        return students.stream()
                .mapToDouble(
                        Student::getGpa
                )
                .average()
                .orElse(0.0);
    }

    public void sortByName() {

        students.sort(
                Comparator.comparing(
                        Student::getName
                )
        );
    }

    public void sortByGpaDescending() {

        students.sort(
                Comparator.comparingDouble(
                        Student::getGpa
                ).reversed()
        );
    }

    public List<Student> goodStudents() {

        return students.stream()
                .filter(
                        s -> s.getGpa() >= 8.0
                )
                .toList();
    }

    public Map<String, Long> statistics() {

        return students.stream()
                .collect(
                        java.util.stream.Collectors.groupingBy(
                                s -> {
                                    if (s.getGpa() >= 8.0) {
                                        return "Gioi";
                                    } else if (s.getGpa() >= 6.5) {
                                        return "Kha";
                                    } else if (s.getGpa() >= 5.0) {
                                        return "Trung binh";
                                    } else {
                                        return "Yeu";
                                    }
                                },
                                java.util.stream.Collectors.counting()
                        )
                );
    }
}
