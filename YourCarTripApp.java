
package yourcartripapp;

import java.util.Scanner;

/**
 *
 * @author geneivaocampo
 */
public class YourCarTripApp {

    public static void main(String[] args) {
        
        //declared variables
        char pointA = 'A';//starts at letter A
        double totalDistance = 0.0;//begins at 0 distance
        double Speed;//user will decide speed
        double totalTime = 0.0;// total time starts at 0
        double gasUsed;//initial gas prior to planned trip
                
        Scanner input = new Scanner(System.in);
        
        //Ask user input for planning a trip
        System.out.println("Are you going on a trip? (1 = Yes, 0 = No)");
        double answer = input.nextDouble();
        
        //Ask user to input the amount of gallons prior to trip
        System.out.println("How many gallons of gas are in your tank. (Int 1-15)");
        gasUsed = input.nextDouble();
                 
        while(answer == 1){//if user chooses 1 program will repeat
            
            System.out.printf("Enter the amount of miles traveled at point %s: \n", pointA);//starting at point A ask user how many miles were traveled
            totalDistance = input.nextDouble();

            System.out.println("Enter speed");//Ask user to input speed
            Speed = input.nextDouble();
            
            
            //Ask if trip will be done again
            System.out.println("Are you going on a trip? (1 = Yes, 0 = No)");//ask user if they want to add another leg to the trip
            answer = input.nextDouble();
            
            //Equations
            totalDistance++;//Add distance to previous distance
            totalTime += totalDistance / Speed * 60;//calculates distance over time mph
            gasUsed -= totalDistance / 25;//the average car uses 25 gallons per mile
            
            //will iterate to the next point if user decides to add another trip
            pointA++;
        }
        gasUsed++;//will iterate the gas equation for each time it asks user input
        System.out.printf("You traveled about %.2f miles in about %.2f minutes.\n", totalDistance, totalTime);
        MyCar leg1 = new MyCar(gasUsed ); // create MyCar object that has gas starting at user input
        
        // get method from object and alert us if we have enough gas to proceed
        leg1.getTotalFuel();

    }
    
}
