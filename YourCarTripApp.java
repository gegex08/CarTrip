
package yourcartripapp;

import java.util.Scanner;

/****************************************************
 * Programmer: Geneiva Ocampo
 * Course CSCI 1471
 * Date 02/16/2024
 * Assignment: Homework #4: YourCarTrip
 * Environment Java with Netbeans
 * Files Included: YourCarTrip and MyCar
 * Purpose: To write an app that allows user to enter the 
 * Input: enter positive number
 * Preconditions/ Assumptions: gas tank holds 15 gallons of gas, assume car gas burns at 25 mpg
 * Equations: totalTime += totalDistance / Speed * 60; gasUsed -= totalDistance / 25
 * Output: Are you going on a trip (1 = Yes or 0 = No)?  1
 * How many gallons of gas in your tank (Integer 1-15)? 2
 * Enter Leg 1 Distance (miles): 3.5
 * Enter Leg 1 Speed (MPH Integer): 30
 * Is there another Leg to your trip (1 = Yes or 0 = No)? 1
 * Enter Leg 2 Distance (miles): 26.3
 * Enter Leg 2 Speed (MPH Integer): 65
 * Is there another Leg to your trip (1 = Yes or 0 = No)? 1
 * Enter Leg 3 Distance (miles): 2.0
 * Enter Leg 3 Speed (MPH Integer): 30
 * Is there another Leg to your trip (1 = Yes or 0 = No)? 1
 * Enter Leg 4 Distance (miles): 4.3
 * Enter Leg 4 Speed (MPH Integer): 45
 * Is there another Leg to your trip (1 = Yes or 0 = No)? 0
 * You traveled about 36.1 miles in about 41.4 minutes.
 * Your car will need more gas to return.
 * Postconditions/Assumptions: Data Type are Double, gas tank holds 15 gallons of gas, assume car gas burns at 25 mpg
 * Contraints: not to exceed more miles per trip
 * Algorithm: 
 * //Ask user input for planning a trip
 * //Ask user to input the amount of gallons prior to trip
 * //if user chooses 1 for planning program will repeat
 * //starting at point A ask user how many miles were traveled
 * //Ask user to input speed
 * //Ask if trip will be done again
 * //ask user if they want to add another leg to the trip
 * //Add distance to previous distance
 * //calculates distance over time mph
 * //the average car uses 25 gallons per mile
 * //will iterate the gas equation for each time it asks user input
 * // create MyCar object that has gas starting at user input
 *  // get method from object and alert us if we have enough gas to proceed
        
 ****************************************************/


public class YourCarTripApp {

    public static void main(String[] args) {
        
        //declared variables
        char pointA = 'A';//starts at letter A
        double distance; //to be given a value for each distance
        double totalDistance=0.00;//to store the total distance traveled beginning with number 1
        double Speed;//user will decide speed
        double time;// set a variable to get time for speed
        double totalTime = 0.0;// total time starts at 0
        double initialGas;//initial gas prior to planned trip
        double gasUsed= 0.0;
        
                
        Scanner input = new Scanner(System.in);
        
        //Ask user input for planning a trip
        System.out.println("Are you going on a trip? (1 = Yes, 0 = No)");
        double answer = input.nextDouble();
        
        //Ask user to input the amount of gallons prior to trip
        System.out.println("How many gallons of gas are in your tank. (Int 1-15)");
        initialGas = input.nextDouble();
        
        while(answer == 1){//if user chooses 1 program will move to next set of question
        
        System.out.println("Enter the number of legs for the trip:");
            int numLegs = input.nextInt();         
        
        for (int leg = 1; leg <= numLegs; leg++) {   
            
            System.out.printf("Enter the amount of miles traveled at point %s: \n", pointA);//starting at point A ask user how many miles were traveled
            distance = input.nextDouble();
            distance++;//to add each distance together

            System.out.println("Enter speed");//Ask user to input speed
            Speed = input.nextDouble();
            
            //Equations
            time = distance * Speed / 60;//calculates distance over time mph
            totalTime += time;// add leg time to the total time
            totalDistance += distance-1; // add distance for this leg to total distance
            gasUsed += totalDistance / 25;//the average car uses 25 gallons per mile
            
            //will iterate to the next point if user decides to add another trip
            
           
            pointA++;
        }
            double remainingGas = initialGas - gasUsed;
            System.out.printf("You traveled about %.2f miles in about %.2f minutes.\n", totalDistance, totalTime);
            System.out.printf("You have %.2f gallons of gas remaining.\n", remainingGas);
            // Create MyCar object
            MyCar car = new MyCar(initialGas);//check to calculate each leg trip calculation

            

        
        System.out.println("Are you going on a trip? (1 = Yes, 0 = No)");
        answer = input.nextDouble();
            
        }
        
        
    }
    
}
