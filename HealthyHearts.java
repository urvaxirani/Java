/**
 *@author Urvax Irani
 *email: urvax.irani@gmail.com
 *date: 9/20/2021
 *purpose: HealthyHearts
 */
package HealthyHearts;

import java.util.Scanner;


public class HealthyHearts {
    public static void main(String[] args) {
        
        //Declaring variables to store age, the string value of age read from console, maximum heart rate,minimum target and maximum target heart rate
        int age;
        String stringAge;
        int maximumHeartRate;
        int minimumTarget;
        int maximumTarget;
        
        /*Provide a prompt to user to enter his age
        Take input of user's age from console, 
        convert the string value to integer and 
        store it in the age variable*/
         Scanner myScanner = new Scanner(System.in);
         System.out.println("What is your age? ");
         stringAge = myScanner.nextLine();
         age = Integer.parseInt(stringAge);
         
         //Perform calculations to find maximum heart rate and minimum and maximum target heart rate using user age
         maximumHeartRate = 220 - age;
         minimumTarget = maximumHeartRate * 50 / 100;
         maximumTarget = maximumHeartRate * 85 / 100;
         
         //Print out the result
         System.out.println("Your maximum heart rate should be "  + maximumHeartRate +  " beats per minute");
         System.out.println("Your target HR Zone is " +  minimumTarget + "-" + maximumTarget +  " beats per minute");
        
    }
    
}
