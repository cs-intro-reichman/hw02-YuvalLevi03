
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean isGirl = false;
		boolean isBoy = false;
		double random;
		int sum = 0;

		do { 
            random = Math.random();
            if (random < 0.5) {
            	isBoy = true;
            	sum += 1;
            	System.out.print("b");
            }
            else {
            	isGirl = true;
            	sum += 1;
            	System.out.print("g");
            } 
           if (! (isGirl && isBoy)) {
        	    System.out.print(" ");
            }
     	}
        while (! (isGirl && isBoy));

            System.out.println();
            System.out.println("You made it... and you now have " + sum + " children.");
	}
}
