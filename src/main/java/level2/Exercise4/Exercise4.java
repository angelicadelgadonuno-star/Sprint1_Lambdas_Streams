package level2.Exercise4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercise4 {

    private List<String> mixList() {
        return new ArrayList<>(Arrays.asList("4", "ball", "53", "pants", "100",
                "animal", "person", "number"));
    }

    public List<String> sortWithFirstChar() {
        return mixList().stream().sorted(Comparator.comparingInt
                (sChar -> sChar.charAt(0))).toList();
    }

    public List<String> sortWithEFirst() {
        return mixList().stream().sorted((st1, st2) -> Boolean.compare
                (st2.contains("e"), st1.contains("e"))).toList();
    }

    public List<String> replaceAWith4() {
        return mixList().stream().map(s1 -> s1.contains("a") ?
                s1.replace('a', '4') : s1).toList();
    }

    public List<String> showOnlyNumbers() {
        return mixList().stream()
                .filter(s1 -> s1.matches("-?\\d+")).toList();
    }

}
