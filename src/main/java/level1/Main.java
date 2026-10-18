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

        System.out.println("--- Exercise 3: Print months with Lambda ---");
        Exercise3_4 ext3 = new Exercise3_4();
        ext3.printMonthsWithLambda();

        System.out.println("--- Exercise 4: Print months with Method Reference ---");
        Exercise3_4 ext4 = new Exercise3_4();
        ext4.printMonthsWithMethodReference();

        System.out.println("--- Exercise 6: sorted list by ascending length ---");
        Exercise6_7 ext6 = new Exercise6_7();
        System.out.println(ext6.getSortedByLengthAscending());
    }

}
