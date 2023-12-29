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
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int sumTotal = 0;

		for (int i = 1; i < (trials + 1); i++) {
		 sum = 0;
     isGirl = false;
     isBoy = false;
		     do { 
              random = Math.random();
              if (random < 0.5) {
            	  isBoy = true;
            	  sum += 1;
                }
              else {
            	  isGirl = true;
            	  sum += 1;
                } 
     	    }
          while (! (isGirl && isBoy));

         sumTotal += sum;

        switch (sum) {
        case 2: sum2 += 1;
        	break;
        case 3: sum3 += 1;
        	break;
        default: sum4 += 1;

        }
        }
        System.out.println("Average: " + ( (double) sumTotal / trials) + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + sum2);
        System.out.println("Number of families with 3 children: " + sum3);
        System.out.println("Number of families with 4 or more children: " + sum4);
        int mostCommon = Math.max(sum2 , (Math.max(sum3 , sum4)));
        System.out.print("The most common number of children is ");
          if (mostCommon == sum2) {
            System.out.print("2.");
        } else if (mostCommon == sum3) {
            System.out.print("3.");
        } else {
            System.out.print("4 or more.");
        }

	}  
}

