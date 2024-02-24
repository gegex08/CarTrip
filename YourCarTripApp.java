/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daysinmonth;

import java.util.Scanner;

/**
 *
 * @author geneivaocampo
 */
public class DaysInMonth {

    
  public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year: ");// Ask User for year
        int year = input.nextInt();
        System.out.println("Enter the month (1-12): ");//Ask User for month
        int month = input.nextInt();

        switch (month) {
            //All user inputs number equal to the case for 30 days
            case 4:
                System.out.println("April has 30 days");
                break;
            case 6:
                System.out.println("June has 30 days");
                break;
            case 9:
                System.out.println("September has 30 days");
                break;
            case 11:
                System.out.println("November has 30 days");
                break;
            //All user inputs number equal to the case for 31 days
            case 1:
                System.out.println("January has 31 days");
                break;
            case 3:
                System.out.println("March has 31 days");
                break;
            case 5:
                System.out.println("May has 31 days");
                break;
            case 7:
                System.out.println("July has 31 days");
                break;
            case 8:
                System.out.println("August has 31 days");
                break;
            case 10:
                System.out.println("October has 31 days");
                break;
            case 12:
                System.out.println("December has 31 days");
                break;
            //month of february for each 4 years with the exection 
            case 2:
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    System.out.println("February has 29 days in year " + year);
                } else {
                    System.out.println("February has 28 days in year " + year);
                }
                break;
            default:
                System.out.println("Not a valid Month");
        }
  }
}

    

