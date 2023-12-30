/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
    public static void main (String[] args) {
	int trials = Integer.parseInt(args[0]);
	boolean isGirl = false;
	boolean isBoy = false;
	double random;
	int sum = 0;
	int sumTotalChild = 0;    
	int count2 = 0;
	int count3 = 0;
	int count4 = 0;

	for (int i = 1 ; i < (trials + 1) ; i++) {
	    sum = 0;                        // Reset variables before the inner loop
            isGirl = false;
            isBoy = false;
           do {                             // inner loop for a single family
           random = Math.random();
             if (random < 0.5) {
               isBoy = true;
               sum += 1;
             } else {
               isGirl = true;
               sum += 1;
             } 
     	   } while (! (isGirl && isBoy));
		
          sumTotalChild += sum;             // Adding the current child count to the total sum
          switch (sum) {                    // Adding 1 to the relevant family type count
          case 2: count2 += 1;
        	  break;
          case 3: count3 += 1;
        	  break;
          default: count4 += 1;
          }
        }
        System.out.println("Average: " + ( (double) sumTotalChild / trials) +
			   " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + count2);
        System.out.println("Number of families with 3 children: " + count3);
        System.out.println("Number of families with 4 or more children: " + count4);
	    
        int mostCommon = Math.max(count2 , (Math.max(count3 , count4))); 
        System.out.print("The most common number of children is ");
          if (mostCommon == count2) {
            System.out.print("2.");
          } else if (mostCommon == count3) {
            System.out.print("3.");
          } else {
            System.out.print("4 or more.");
          }
    }  
}

