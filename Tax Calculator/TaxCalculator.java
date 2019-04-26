/*
Orlino Noneza & Steven Sprouls
on38 & sms968
Lab 2 - Calculators
1/26/19
*/

import java.util.Scanner;

public class TaxCalculator{
  public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);

    /* This part checks the marriage status and income amount */
    System.out.println("Are you Single or Married?");
    String status = sc.next();
    System.out.println("What is your income?");
    int income = sc.nextInt();

    /* This is a sequence of if/else statements that give an appropriate tax
    amount based on their given value */
    if(status.equalsIgnoreCase("single")) {
      if(income > 32000) {
        System.out.println("You owe " + (4400 + ((income - 32000) * 0.25)) +
        " in tax.");
      }
      else if(income > 8000 && income <= 32000) {
        System.out.println("You owe " + (800 + ((income - 8000) * 0.15)) +
        " in tax" );
      }
      else if(income > 0 && income <= 8000) {
        System.out.println("You owe " + (income * 0.1) + " in tax" );
      }
    }
    else if (status.equalsIgnoreCase("married")) {
      if (income > 64000) {
        System.out.println("You owe " + (8800 + ((income - 64000) * 0.25)) +
        " in tax.");
      }
      else if (income > 16000 && income <= 64000){
        System.out.println("You owe " + (1600 + ((income - 16000) * 0.15)) +
        " in tax.");
      }
      else if (income > 0 && income <= 16000){
        System.out.println("You owe " + (income * 0.1) + " in tax.");
      }
    }

  }
}
