package level2.Exercise3;

public class Exercise3 {

    public ArithmeticOperations addition() {
        return (a, b) -> a + b;
    }

    public ArithmeticOperations substraction() {
        return (a, b) -> a - b;
    }

    public ArithmeticOperations multiplication() {
        return (a, b) -> a * b;
    }

    public ArithmeticOperations division() {
        return (a, b) -> a / b;
    }
}
