package level1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Exercise1Test {

    @Test
    void filteredStringOfWordsReturnsWordsWithLetterO() {
        Exercise1 words = new Exercise1();
        List<String> result = words.wordsWithLetterO();
        assertTrue(result.contains("hello"), "Should contain 'hello'");
        assertTrue(result.contains("world"), "Should contain 'world'");
        assertFalse(result.contains("happy"), "Should NOT contain 'happy'");

    }
}