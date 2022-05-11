/*
Scenario: Numbers that are not multiple of 3, 5 and/or  7
Given my FizzBuzzBazz Evaluator
When I evaluate the number <number>
Then the result will be <number>			
Examples: 4, 8, 11, 13, 16, 17, 19		
 */
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
public class TestFizzBuzzBazz {
    @ParameterizedTest
    @CsvSource(value = {
    "1", "2", "4", "8", "11", "13", "16", "17", "19"})
    public void quantEntradaNoMultipleDe3Ni5Ni7(int input) {
        String expected = Integer.toString(input);
        String found = FBBEvaluator.eval(input);
        assertEquals(expected, found);
    }
}