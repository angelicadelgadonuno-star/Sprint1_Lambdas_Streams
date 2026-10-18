package level1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Exercise6_7Test {

    @Test
    void getSortedByLengthAscending_ShouldOrderFromShortestToLongest() {
        Exercise6_7 ext6 = new Exercise6_7();
        List<Object> result = ext6.getSortedByLengthAscending();
        assertEquals(5, result.get(0),"First element should be '5'");
        assertEquals("calculator", result.get(result.size() -1), "last element should be 'calculator'");
    }

    @Test
    void getSortedByLengthDescending_ShouldOrderFromLongestToShortest() {
        Exercise6_7 ext7 = new Exercise6_7();
        List<Object> result = ext7.getSortedByLengthDescending();
        assertEquals("calculator", result.get(0), "First element should be 'calculator'");
        assertEquals(5, result.get(result.size() -1 ), "Last element should be 5");
    }
}