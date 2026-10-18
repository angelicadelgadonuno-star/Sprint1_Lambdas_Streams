package level1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Exercise1 filteredStream = new Exercise1();

        List<String> result = filteredStream.stringsWithLetterO();
        System.out.println(result);
    }
}
