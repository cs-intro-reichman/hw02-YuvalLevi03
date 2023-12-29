/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
    public static void main (String[] args) {
        int random1 = (int) (10 * Math.random());
	int random2;
        System.out.print(random1 + " ");
        
	do {
	    random2 = (int) (10 * Math.random());
	    if (random2 >= random1) { 
		System.out.print(random2 + " ");	
		random1 = random2;
	    }
	} while (random2 >= random1);
	    
	System.out.println();
    } 
} 
