package level2.Exercise3;

public class Main {
    public static void main(String[] args) {

        Exercise3 mathOperations = new Exercise3();

        System.out.println("--- Exercise 3: Calculator ---");
        System.out.println("Addition 10 + 5 = " + mathOperations.addition().operation(10, 5));
        System.out.println("Substraction 10 - 5 = " + mathOperations.substraction().operation(10, 5));
        System.out.println("Multiplication 10 x 5 = " + mathOperations.multiplication().operation(10, 5));
        System.out.println("Division 10 / 5 = " + mathOperations.division().operation(10, 5));

    }
}
