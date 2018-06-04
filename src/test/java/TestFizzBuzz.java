
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by dokmatik on 04.06.18.
 */
public class TestFizzBuzz {


    @ParameterizedTest(name = "\"{0}\" should be {1}")
    @CsvSource({"1, 1", "2, 2", "3, Fizz", "4, 4", "5, Buzz", "6, Fizz", "7, 7", "8, 8", "9, Fizz", "10, Buzz", "11, 11", "12, Fizz", "13, 13", "14, 14", "15, FizzBuzz", "16, 16", "17, 17", "18, Fizz", "19, 19", "20, Buzz"
            , "30, FizzBuzz", "31, 31", "33, Fizz", "35, Buzz", "45, FizzBuzz"})
    public void testFizzBuzz(int number, String expectedOutput) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.fizzBuzz(number), expectedOutput);
    }

}
