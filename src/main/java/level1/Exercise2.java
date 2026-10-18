package level1;

import java.util.Arrays;
import java.util.List;

public class Exercise2 {

public List<String> wordsWithOAndLongerThan5() {
    List<String> words = Arrays.asList("computer", "hello", "drinks", "though", "ball", "world", "ground");

    return words.stream().filter(word-> word.contains("o"))
            .filter(word->word.length() > 5).toList();
}
}
