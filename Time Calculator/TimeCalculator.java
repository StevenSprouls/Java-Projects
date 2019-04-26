/*
Orlino Noneza & Steven Sprouls
on38 & sms968
Lab 2 - Calculators
1/26/19
*/

import java.util.Scanner;

public class TimeCalculator{
  public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);

    /* This is an input that asks for an amount of seconds */
    System.out.println("Enter an amount of seconds: ");
    int input = sc.nextInt();

    /* This reads the input and calculates days/hours/minutes based on their
    input */
    if (input > 86400) {
      final int days = input / 86400;
      int d_remain = input % 86400;
      final int hours = d_remain / 3600;
      int h_remain = d_remain % 3600;
      final int minutes = h_remain / 60;
      final int seconds = h_remain % 60;
      System.out.println(input + " seconds is equal to " + days + " days "
       + hours + " hours " + minutes + " minutes, and " + seconds + " seconds.");
    }

    else if (input > 3600 && input <= 86400) {
      final int hours = input / 3600;
      int h_remain = input % 3600;
      final int minutes = h_remain / 60;
      final int seconds = h_remain % 60;
      System.out.println(input + " seconds is equal to " + hours + " hours "
      + minutes + " minutes, and " + seconds + " seconds.");
    }

    else if (input > 60 && input <= 3600) {
      final int minutes = input / 60;
      final int seconds = input % 60;
      System.out.println(input + " seconds is equal to " + minutes +
      " minutes, and " + seconds + " seconds.");
    }

    else if (input > 0 && input <= 60) {
      final int seconds = input;
      System.out.println(input + " seconds is equal to " + seconds +
      " seconds. (Wow)");
    }

   }
  }
