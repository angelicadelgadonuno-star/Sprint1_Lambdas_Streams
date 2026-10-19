package level2.Exercise4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Exercise4Test {

    private Exercise4 ext4;

    @BeforeEach
    void setUp() {
       ext4 = new Exercise4();
    }

    @Test
    void sortWithFirstChar_ShouldSortByFirstChar() {
        List<String> result = ext4.sortWithFirstChar();
        assertEquals("100", result.getFirst(),"First element should be '100'");
        assertEquals("person",result.getLast(), "Last element should be 'person'");
    }

    @Test
    void sortWithEFirst_ShouldPutWordsWithEFirst() {
        List<String> result = ext4.sortWithEFirst();
        assertTrue(result.getFirst().contains("e"), "First element should contain 'e'");
        assertFalse(result.get(2).contains("e"),"Elements after the first two should NOT contain 'e'");
    }

    @Test
    void replaceAWith4_ShouldReplaceAllAth4() {
        List<String> result = ext4.replaceAWith4();
        assertTrue(result.contains("b4ll"), "Should contain b4ll" );
        assertTrue(result.contains("4nim4l"), "Should contain 4nim4l");
        assertFalse(result.contains("animal"), "Should not contain animal, 'a' must be replaced with '4'");
    }

    @Test
    void showOnlyNumbers_ShouldReturnOnlyNumericStrings() {
        List<String> result = ext4.showOnlyNumbers();
        assertEquals(3, result.size(), "Should have exactly 3 numbers");
        assertTrue(result.contains("100"), "Should contain 100");
        assertFalse(result.contains("ball"), "Should not contain 'ball', should only contain numbers");
    }
}