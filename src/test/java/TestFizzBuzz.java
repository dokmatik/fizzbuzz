import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by dokmatik on 04.06.18.
 */
public class TestFizzBuzz {

    @Test
    public void testFizzBuzz() {
        Assertions.assertEquals(new FizzBuzz().fizzBuzz(3), "Fizz");
    }
}
