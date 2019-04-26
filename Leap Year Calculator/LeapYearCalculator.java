/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyearcalculator;

import java.util.Scanner;

/**
 *
 * @author Steve
 */
public class LeapYearCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Leap Year Calculator");
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Enter a Year: ");
        final int year = keyboard.nextInt();
        
        if ((year % 4 == 0 && year % 100 == 0)|| (year % 400 == 0)){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }
    }
    
}
