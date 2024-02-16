/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yourcartripapp;

import java.util.Scanner;

/**
 *
 * @author geneivaocampo
 */
public class YourCarTripApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char pointA = 'A';//starts at letter A
        double totalDistance = 0.0;//begins at 0 distance
        double Speed;//user will decide speed
        double totalTime = 0.0;// total time starts at 0
        double gasUsed = 0.0;// used gas
        
        MyCar gas1 = new MyCar( 6.00 ); // create MyCar object that has gas starting at 6 gallons
        MyCar odometer1 = new MyCar(60000.00);//create MyCar object that has initial odometer at 60000
        
        Scanner input = new Scanner(System.in);

        System.out.println("Are you going on a trip? (1 = Yes, 0 = No)");
        int answer = input.nextInt();
        
        
        while(answer == 1){//if user chooses 1 program will repeat
            
            System.out.printf("Enter the amount of miles traveled at point %s: \n", pointA);
            totalDistance = input.nextInt();
            
            System.out.println("How many gallons of gas are in your tank. (Int 1-15)");
            gasUsed = input.nextInt();
            
            System.out.println("Enter speed");
            Speed = input.nextInt();
            
            
            //Ask if trip will be done again
            System.out.println("Are you going on a trip? (1 = Yes, 0 = No)");
            answer = input.nextInt();
            
            //Equations
            totalDistance++;//Add distance to previous distance
            totalTime += totalDistance / Speed * 60;//calculates distance over time mph
            gasUsed -= gasUsed;
            
            
            //will iterate to the next point if user decides to add another trip
            pointA++;
        }
        gasUsed++;
        System.out.printf("The total distance traveled:\n", totalDistance);
        System.out.println(totalTime);
        System.out.printf("The total gas Used\n", gasUsed);
        
        // display final numbers of each object
        System.out.printf( "Total Gas Used: %.2f\n", gas1.getTotalFuel() );
        System.out.printf( "Final Odometer Read: %.2f\n", odometer1.getTotalMiles() );
        


    }
    
}
