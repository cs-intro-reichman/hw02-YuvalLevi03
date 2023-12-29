/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int a = Integer.parseInt(args[0]);
		int sum = 1;
		String b = "";

		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
			b += (" + " + i);
			sum += i;
		}}
		   if (sum == a) {System.out.println(a + " is a perfect number since " + a + " = 1" + b);
		}
		   else {System.out.println(a + " is not a perfect number");}
		}
	}
