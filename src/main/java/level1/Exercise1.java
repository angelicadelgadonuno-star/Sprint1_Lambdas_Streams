package level1;

import java.util.Arrays;
import java.util.List;

public class Exercise1 {

    public List<String> stringsWithLetterO() {
        List<String> words = Arrays.asList("hello", "help", "world", "ball", "ground", "logic", "happy");

        List<String> filteredWords = words.stream()
                .filter(word -> word.contains("o")).toList();
        return filteredWords;
    }
}
