package level2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {

    private List <Integer> numbers = Arrays.asList(22, 33, 44,55,66,77,88,99);

    public String formatNumbers() {
        return numbers.stream().map(number ->(number % 2 == 0 ? "e" : "o") + String.valueOf(number))
                .collect(Collectors.joining(", "));
    }
}
