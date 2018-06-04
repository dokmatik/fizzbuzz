/**
 * Created by dokmatik on 04.06.18.
 */
public class FizzBuzz {
    public String fizzBuzz(int i) {
        String returnValue = "";
        boolean teilbarDurch3 = i % 3 == 0;
        boolean teilbarDurch5 = i % 5 == 0;
        if (teilbarDurch3) {
            returnValue += "Fizz";
        }
        if (teilbarDurch5) {
            returnValue += "Buzz";
        }
        if (!(teilbarDurch3 || teilbarDurch5)) {
              returnValue += i;
        }

        return returnValue;
    }
}
