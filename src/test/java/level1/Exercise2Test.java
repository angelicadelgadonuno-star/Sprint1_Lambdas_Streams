package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class Exercise2Test {

    @Test
    void filteredStringWordsWithOAndLongerThan5ReturnsWordsWithOAndLongerThan5() {

        Exercise2 words2 = new Exercise2();
        List<String> result2 = words2.wordsWithOAndLongerThan5();
        assertTrue(result2.contains("computer"), "Should contain 'computer'");
        assertTrue(result2.contains("ground"), "Should contain 'ground'");
        assertFalse(result2.contains("hello"), "Should NOT contain 'hello' it´s only 5 letters");
        assertFalse(result2.contains("drinks"), "Should NOT contain 'drinks' it has 6 letters but no 'o'");

    }
}