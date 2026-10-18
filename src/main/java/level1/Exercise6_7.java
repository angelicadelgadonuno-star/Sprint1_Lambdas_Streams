package level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Exercise6_7 {

    private List<Object> getMixtList() {
        return Arrays.asList("apples", 5, "keys", "calculator", 45, "shoes", 25);
    }

    public List<Object> getSortedByLengthAscending() {
        return getMixtList().stream().sorted(Comparator.comparingInt
                (o->String.valueOf(o).length())).collect(Collectors.toList());
    }






}
