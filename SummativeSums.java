/**
 *@author Urvax Irani
 *email: urvax.irani@gmail.com
 *date: 9/20/2021
 *purpose: SummativeSums
 */
package SummativeSums;

import java.lang.reflect.Method;


public class SummativeSums {
    public static void main(String[] args) {
        //Declaring the 3 arrays and initializing them
        int[] array1 = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] array2 = { 999, -60, -77, 14, 160, 301 };
        int[] array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
140, 150, 160, 170, 180, 190, 200, -99 };
        
        //Applying the method to each array and printing the result
        System.out.println("#1 Array Sum: " + sumOfArrays(array1) );
        System.out.println("#2 Array Sum: " + sumOfArrays(array2) );
        System.out.println("#3 Array Sum: " + sumOfArrays(array3) );
    }
    
    /* Creating a method to calculate sum of individual elements in an array 
    with an integer return type and using array input in the parameter*/
    public static int sumOfArrays(int[]arrays) {
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum += arrays[i];
        }
    return sum;
    }  
}

