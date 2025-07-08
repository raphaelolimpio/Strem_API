package functional_interface;

import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        BinaryOperator<Integer> sum = (num1, num2) -> num1 + num2;

        int result = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println(result);
    }
}
