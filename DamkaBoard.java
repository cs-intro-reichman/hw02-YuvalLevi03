/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
    public static void main(String[] args) {
	int a = Integer.parseInt(args[0]);
	String b = "";
	String c = "";

	for (int i = 1 ; i < (a + 1) ; i++) {
	     b += "* ";
	     c += " *";
	}
	for (int i = 1 ; i < (a + 1) ; i++) {
	     if (i % 2 == 0) {
	      System.out.println(c);
	     } else {
	      System.out.println(b);
	     }
	}
    }
}
	

