package level2.Exercise3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise3Test {

    private Exercise3 mathOperations;

    @BeforeEach
    void setUp() {
        mathOperations = new Exercise3();
    }

    @Test
    void additionReturnsCorrectSum() {
        assertEquals(15.0f, mathOperations.addition().operation(10, 5), "10 + 5: should be 15");
    }

    @Test
    void substractionReturnsCorrectSubstraction() {
        assertEquals(5.0f, mathOperations.substraction().operation(10, 5), "10 - 5: should be 15");
    }

    @Test
    void multiplicationReturnsCorrectMultiplication() {
        assertEquals(50.0f, mathOperations.multiplication().operation(10, 5), "10 * 5: should be 50");
    }

    @Test
    void divisionReturnsTheCorrectDivision() {
        assertEquals(2.0f, mathOperations.division().operation(10, 5), "10 / 5: should be 2");
    }
}