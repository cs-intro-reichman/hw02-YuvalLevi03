/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
    public static void main (String[] args) {
        int a = Integer.parseInt(args[0]); // #feedback - please name the variables with a name that indicates its purpose and what it holds.

        for (int i = 1 ; i < (a + 1) ; i++) {
	    if (a % i == 0) {
	    System.out.println(i);	
	    }
        }
    }
}
