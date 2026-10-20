package level2;

import java.util.Arrays;
import java.util.List;

public class Exercise1 {

    private List<String> names = Arrays.asList("Angelica", "Manuela", "Ana", "Antonio", "ali", "Aaron", "Martin", "Ari", "Amy");

    public List<String> sortNamesStartingWithAAndHaveExactlyThreeLetters() {
        return names.stream().filter(name -> name.startsWith("A") && name.length() == 3).toList();

    }
}

