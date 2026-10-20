package level1;

import java.util.Arrays;
import java.util.List;

public class Exercise3_4 {

    private List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December");

    public void printMonthsWithLambda() {

    months.forEach(month-> System.out.println(month));

    }
    public void printMonthsWithMethodReference() {
       List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");

        months.forEach(System.out::println);

    }
}
