/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yourcartripapp;

/**
 *
 * @author geneivaocampo
 */
public class MyCar {
    
    private int fuel;
    private int odometer;
    
    // constructor  
   public MyCar(double initialFuel )
   {
      // 
      // 
      if ( initialFuel > 0.0 ) {
          fuel -= initialFuel;   
      }
      else{
          System.out.println("Your car will need more gas to return.\n");
      }
   } // end constructor
   
   public void carFuel( double fuelUsed )
   {      
      fuel -= fuelUsed; // add amount to balance 
   } 
   public void updateOdometer( double addMiles )
   {      
      odometer += addMiles; // add amount to balance 
   } 
   
   public double getTotalFuel(){
       return fuel;
   }
   public double getTotalMiles(){
       return odometer;
   }
    
}
