/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Steve
 */
public class AverageApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter file name: ");
        String fileName = input.next();
        input.close();

        File file = new File(fileName);
        Scanner in = null;

        try {
            in = new Scanner(file);
        } 
	catch (FileNotFoundException e) {
            System.out.println("This file was not found, make sure you type the name correctly.");
	    System.exit(0);
        }
	

        float sumOfColumnOne = 0;
        float sumOfColumnTwo = 0;
        int numberOfRows = 0;
        while (in.hasNextLine()) {
            String[] row = in.nextLine().split("\\s");
            sumOfColumnOne += Float.parseFloat(row[0]);
            sumOfColumnTwo += Float.parseFloat(row[1]);
            numberOfRows++;
        }
        
        in.close();

        System.out.printf("The average of column 1: %.2f\n", sumOfColumnOne / numberOfRows);
        System.out.printf("The average of column 2: %.2f\n", sumOfColumnTwo / numberOfRows);
    }
    }