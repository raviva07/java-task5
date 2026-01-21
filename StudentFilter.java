import java.util.Arrays;
import java.util.List;

public class StudentFilter {
    public static void main(String[] args) {

        List<String> students = Arrays.asList(
                "Anil", "Ravi", "Amit", "Suresh",
                "Arjun", "Kiran", "Ajay", "Vijay",
                "Asha", "Manoj"
        );

        students.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }
}
