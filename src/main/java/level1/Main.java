package level1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Exercise1 filteredStream = new Exercise1();

        List<String> result = filteredStream.wordsWithLetterO();
        System.out.println("--- Words containing letter 'o' ---");
        System.out.println(result);

        Exercise2 secondFilteredStream = new Exercise2();

        List<String> result2 = secondFilteredStream.wordsWithOAndLongerThan5();
        System.out.println("--- Words containing letter 'o' and are longer that 5 letters ---");
        System.out.println(result2);
    }
}
