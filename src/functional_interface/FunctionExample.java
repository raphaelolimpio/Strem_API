package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Function<Integer, Integer> duplicator = number -> number * 2;

        List<Integer> numberDuplicator = numbers.stream()
                .map(duplicator)
                .toList();

        numberDuplicator.forEach(n -> System.out.println(n));

    }

}
