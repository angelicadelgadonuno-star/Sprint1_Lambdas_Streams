package level2.Exercise3;

public class Main {
    public static void main(String[] args) {

        Exercise3 mathOperations = new Exercise3();

        System.out.println("--- Exercise 3: Calculator ---");
        System.out.println("Addition: " + mathOperations.addition().operation(10, 5));
        System.out.println("Substraction: " + mathOperations.substraction().operation(10, 5));
        System.out.println("Multiplication: " + mathOperations.multiplication().operation(10, 5));
        System.out.println("Division " + mathOperations.division().operation(10, 5));

    }
}
