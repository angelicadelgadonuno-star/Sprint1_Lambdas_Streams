package level2;

import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {


        Exercise1 filteredNames = new Exercise1();

        List<String> resultantNames = filteredNames.sortNamesStartingWithAAndHaveExactlyThreeLetters();
        System.out.println("--- Names starting with letter 'A' and have a length of exactly 3 letters ---");
        System.out.println(resultantNames);

        Exercise2 filteredNumbers = new Exercise2();
        String sortedNumbers = filteredNumbers.formatNumbers();
        System.out.println("\n--- Sorted Numbers ---");
        System.out.println(sortedNumbers);
    }
}
