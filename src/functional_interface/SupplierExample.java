package functional_interface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "A vida é bela!";

        List<String> listaSaudacoes = Stream.generate(() -> "A vida é bela!")
                .limit(5)
                .toList();

        listaSaudacoes.forEach(System.out::println);
    }

}
