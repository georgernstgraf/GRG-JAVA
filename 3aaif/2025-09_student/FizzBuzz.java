
/**
 * Write a description of class FizzBuzz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FizzBuzz
{
    public static void fizzBuzz () {
        for ( int i = 1 ;  i <= 1155 ; i++) {
            String printme = "";
            if (i % 3 == 0) printme += "Fizz";
            if (i % 5 == 0) printme += "Buzz";
            if (i % 7 == 0) printme += "Whizz";
            if (i % 11 == 0) printme += "Bang";
            if (printme.isEmpty()) System.out.println(i);
            else System.out.println(printme);
        }
    }
}