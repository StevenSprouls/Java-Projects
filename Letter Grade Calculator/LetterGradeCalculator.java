/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lettergradecalculator;

import java.util.Scanner;

/**
 *
 * @author Steve
 */
public class LetterGradeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        Scanner grade = new Scanner(System.in);
        
        int grade_1,grade_2,grade_3;
        String letter_grade;
        float average;
        int total_grade;
        
        System.out.print("Enter the score of first test: ");
        grade_1 = grade.nextInt();
        System.out.print("Enter the score of the second test: ");
        grade_2 = grade.nextInt();
        System.out.print("Enter the score of the third test: ");
        grade_3 = grade.nextInt();
        
        total_grade = grade_1 + grade_2 + grade_3;
        
        average = total_grade/3;
         
        if (average >= 90)
        {
        letter_grade = "A";
        }
        else if (average >= 80 && average <= 89)
        {
        letter_grade = "B";
        }
        else if (average >= 70 && average <= 79)
        {
        letter_grade = "C";
        }
        else if (average >= 60 && average <= 69)
        {
        letter_grade = "D";
        }
        else
        {
        letter_grade = "F";
        }
        
        System.out.println("Your average is " + average);
        System.out.println("Your letter grade is " + letter_grade);
        
    }
                
}    
       

    

