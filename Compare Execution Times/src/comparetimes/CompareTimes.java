/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparetimes;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Steve
 */
public class CompareTimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long startTimeArray = System.nanoTime();
        int Array[] = new int[999999];
        for(int i = 0; i < 1000000; i++ ){}
        long endTimeArray = System.nanoTime();
        long totalTimeArray = endTimeArray - startTimeArray;
        System.out.println("The array's execution time: "+ totalTimeArray);
        
        long startTimeArrayList = System.nanoTime();
        ArrayList<Integer> ArrayList = new ArrayList<>();
        for(int i = 0; i <= 1000000; i++ ){ArrayList.add(i);}
        long endTimeArrayList = System.nanoTime();
        long totalTimeArrayList = endTimeArrayList - startTimeArrayList;
        System.out.println("The array list's execution time: "+ totalTimeArrayList);
        
        long startTimeLinkedList = System.nanoTime();
        LinkedList<Integer>LinkedList = new LinkedList<>();
        for(int i = 0; i <= 1000000; i++ ){LinkedList.add(i);}
        long endTimeLinkedList = System.nanoTime();
        long totalTimeLinkedList = endTimeLinkedList - startTimeLinkedList;
        System.out.println("The Linked List's execution time: " + totalTimeLinkedList);
    }
    
}
