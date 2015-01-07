/*
 * This program displays a conversion table 
of gallons to liters.
 */
package gallonstolitertable;

/**
 *
 * @author Rich Bell
 */
public class GallonsToLiterTable {

    public static void main(String[] args) {
        double gallons, liters;
        int counter;
        
        counter = 0; //sets counter to zero
        for(gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; // convert to liters
            System.out.println(gallons + " gallons is " + liters + " liters.");
            
            counter++;
            //every 10th line, print a blank line
            if(counter == 10) {
                System.out.println();
                counter = 0; //reset the line counter
            }
        }
    }
    
}
