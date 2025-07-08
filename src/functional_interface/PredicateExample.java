package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Predicate", "Stream", "API", "Lambda");

        Predicate<String> maisDeCincocCaracteres = palavra -> palavra.length() > 5;

        palavras.stream()
                .filter(maisDeCincocCaracteres)
                .forEach(System.out::println);
    }
}
