package level2;

import java.util.Arrays;
import java.util.List;

public class Exercise1 {

    public List<String> names = Arrays.asList("Angelica", "Manuela", "Ana", "Antonio", "Ali", "Aaron", "Martin", "Ari");

    public List<String> sortNamesStartingWithAAndHaveExactlyThreeLetters() {
        return names.stream().filter(name -> name.startsWith("A"))
                .filter(name -> name.length() == 3).toList();
    }
}

