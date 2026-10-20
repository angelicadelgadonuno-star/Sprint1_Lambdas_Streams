package level1;

import java.util.Arrays;
import java.util.List;

public class Exercise1 {

    private List<String> words = Arrays.asList("hello", "help", "world", "ball", "ground", "logic", "happy");

    public List<String> wordsWithLetterO() {
        List<String> filteredWords = words.stream()
                .filter(word -> word.contains("o")).toList();
        return filteredWords;
    }
}
