/**
 * Created by dokmatik on 04.06.18.
 */
public class FizzBuzz {
    public String fizzBuzz(int i) {
        String returnValue = "";
        if (i % 3 == 0) {
            returnValue += "Fizz";
        }
        if (i % 5 == 0) {
            returnValue += "Buzz";
        }
        if (i == 1) {
              returnValue += i;
        }

        return returnValue;
    }
}
