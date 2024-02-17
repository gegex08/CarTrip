package yourcartripapp;

/**
 *
 * @author geneivaocampo
 */
public class MyCar {
    
    private double fuel;//instance variable that store each value for fuel as trip progresses
    
    // constructor  
   public MyCar(double fuel )
   {
      //if fuel is greater than zero after each planned trip after the 
      // the equation for used gallons per mile
      if (fuel >= 0) {
            //print message that they have enough gas for trip
            System.out.println("You have enough fuel for your trip.");
        } 
      //print message that they do not have enough gas for trip
      else {
            System.out.println("You do not have enough fuel for your trip.");
        }
      
   } 
 
   public double getTotalFuel(){
       return fuel;//gives value to the amount left over 
   }

    
}
