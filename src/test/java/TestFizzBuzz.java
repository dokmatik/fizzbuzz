import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by dokmatik on 04.06.18.
 */
public class TestFizzBuzz {

    @Test
    public void testFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.fizzBuzz(3), "Fizz");
        assertEquals(fizzBuzz.fizzBuzz(5), "Buzz");
        assertEquals(fizzBuzz.fizzBuzz(15), "FizzBuzz");
        assertEquals(fizzBuzz.fizzBuzz(1), "1");
        assertEquals(fizzBuzz.fizzBuzz(2), "2");
        assertEquals(fizzBuzz.fizzBuzz(6), "Fizz");
        assertEquals(fizzBuzz.fizzBuzz(7), "7");
        assertEquals(fizzBuzz.fizzBuzz(8), "8");
        assertEquals(fizzBuzz.fizzBuzz(9), "Fizz");
        assertEquals(fizzBuzz.fizzBuzz(10), "Buzz");
        assertEquals(fizzBuzz.fizzBuzz(11), "11");
    }
}
