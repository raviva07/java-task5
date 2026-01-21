import java.util.stream.Stream;

public class UpperCaseExample {
    public static void main(String[] args) {

        Stream<String> names = Stream.of("aBc", "d", "ef");

        names
            .map(s -> s.toUpperCase())
            .forEach(System.out::println);
    }
}
