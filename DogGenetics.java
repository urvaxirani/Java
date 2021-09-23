/**
 *@author Urvax Irani
 *email: urvax.irani@gmail.com
 *date: 9/20/2021
 *purpose: DogGenetics
 */
package com.sg.foundations.doggenetics;

import java.util.Random;
import java.util.Scanner;


public class DogGenetics {
    public static void main(String[] args) {
        //Declaring variables for scanner of user input, random generator, dog name and breed percentage
        Scanner inputReader = new Scanner(System.in);
        Random rGen = new Random();

        String dogName;
        int startPercent = 100;
        int breedPercent = 0;

        //Taking input from user for his dog's name
        System.out.println("What is your dog's name?");
        dogName = inputReader.nextLine();
        
        //Declaring an array with the 5 dog breeds
        String[] breeds = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"};
                
        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here. ");
        System.out.println("");
        System.out.println(dogName + " is: ");
        System.out.println("");
        
        //Using a for loop to loop through the array and give random percentages to the dog breeds
        for (int i = 0; i < 5; i++) {
            String breed = "";
            breed = breeds[i];
            if (i != 4) {
                breedPercent = rGen.nextInt(startPercent);
                startPercent -= breedPercent;
            } 
            else {
                breedPercent = startPercent;
            }
            
            //Printing out the result
            System.out.println(breedPercent + "% " + breed );

        }
        System.out.println("");
        System.out.println("WOW, that's QUITE the dog!!");
    }
}
