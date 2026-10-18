package level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Exercise1 {

   public void stringsWithLetterO() {
       List<String> words = Arrays.asList("hello","help", "world", "ball", "ground", "logic", "happy");

       List<String> filteredWords = words.stream().filter(word-> words.contains("o")).collect(Collectors.toList());
   }
}
