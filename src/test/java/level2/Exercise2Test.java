package level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise2Test {

    @Test
    void formatNumbersReturn_o_Plus_NumberIfOddNumberOr_e_Plus_NumberIfEvenNumber() {
        Exercise2 oddAndEvenNumbers = new Exercise2();
        String oddAndEvenResult = oddAndEvenNumbers.formatNumbers();
        assertEquals("e22, o33, e44, o55, e66, o77, e88, o99", oddAndEvenResult, "The formatted string is not correct");
    }
}