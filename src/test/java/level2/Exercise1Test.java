package level2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Exercise1Test {

    @Test
    void sortNamesStartingWithAAndHaveExactlyThreeLettersReturnsNamesStartingWithAAndAre3Letters() {
        Exercise1 names = new Exercise1();
        List<String> resultNames = names.sortNamesStartingWithAAndHaveExactlyThreeLetters();
        assertTrue(resultNames.contains("Ana"),"Should contain 'Ana'");
        assertTrue(resultNames.contains("Amy"),"Should contain 'Amy'");
        assertFalse(resultNames.contains("ali"),"Should NOT contain 'ali'");
    }
}

