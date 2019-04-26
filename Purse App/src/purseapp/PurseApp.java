/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purseapp;

/**
 *
 * @author Steve
 */
public class PurseApp {
    
    public static int findLargest(Purse[] purses){
        int PurseIndex = 0;
        for(int i = 0 ; i < purses.length-1; i++ ){
            if(purses[i+1].compareTo(purses[i]) == 1){
                PurseIndex = i+1;
                    }
        }
        return PurseIndex;        
    } 
    
    public static void main(String[] args) {
        Purse[] purses = new Purse[3];
        
        Purse purse1 = new Purse();
        purse1.SetPennyAmount(2);
        purse1.SetNickelAmount(0);
        purse1.SetDimeAmount(5);
        purse1.SetQuarterAmount(0);
        purse1.SetDollarAmount(4);
        
        Purse purse2 = new Purse(2, 3, 1, 0, 2 );
        
        Purse purse3 = new Purse(purse1);
        purse3.pennies = 0;
        purse3.nickels = 0;
        purse3.dimes = 0;
        purse3.quarters = 3;
        purse3.dollars = 1;
        purses[0] = purse1;
        purses[1] = purse2;
        purses[2] = purse3;
        System.out.println(purses[findLargest(purses)].toString());
    }
}
    
    
    