package de.goktay.fizzbuzz;

/**
 * Created by dokmatik on 04.06.18.
 */
public class FizzBuzz {
    /**
     * Implementirung der FizzBuzz Funktion.
     *
     * @param i Eine Ganzzahl
     * @return Sofern i durch 3 teilbar ist, wird "Fizz" zurückgegeben. Sofern i durch 5 teilbar ist, wird "Buzz" zurückgegeben. Ist i sowohl durch 3 als auch 5 teilbar, wird "FizzBuzz" zurückgegeben. In allen anderen Fällen wird die Eingangszahl als Text zurückgegeben.
     */
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
